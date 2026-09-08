package dev.nvtruong.oop;

import dev.nvtruong.oop.systems.CheckoutService;
import dev.nvtruong.oop.systems.Library;
import dev.nvtruong.oop.systems.ParkingLot;
import dev.nvtruong.oop.systems.VendingMachine;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SystemsTest {
    @Test void upgradesVendingMachineFromSwitchToDomainModel() {
        VendingMachine machine = new VendingMachine();
        machine.restock(VendingMachine.Product.COCA, 2);
        machine.insertMoney(500);
        var purchase = machine.buy(VendingMachine.Product.COCA);
        assertEquals(300, purchase.changeCents());
        assertEquals(1, machine.stockOf(VendingMachine.Product.COCA));
    }

    @Test void usesStrategyForCheckout() {
        CheckoutService checkout = new CheckoutService();
        CheckoutService.Wallet wallet = new CheckoutService.Wallet(new BigDecimal("100"));
        var result = checkout.checkout(new CheckoutService.Order("O1", new BigDecimal("40")), wallet);
        assertTrue(result.successful());
        assertEquals(new BigDecimal("60"), wallet.balance());
    }

    @Test void modelsLibraryAndParkingLot() {
        Library library = new Library();
        library.addBook(new Library.Book("1", "DDD"));
        library.register(new Library.Member("m1", "Truong"));
        library.borrow("1", "m1", LocalDate.of(2026, 9, 8), 14);
        assertFalse(library.isAvailable("1"));
        library.returnBook("1");
        assertTrue(library.isAvailable("1"));

        ParkingLot lot = new ParkingLot();
        lot.addSpot("C1", ParkingLot.Size.COMPACT);
        var ticket = lot.park(new ParkingLot.Vehicle("51A-12345", ParkingLot.Size.MOTORBIKE), Instant.EPOCH);
        assertEquals(2, lot.leave(ticket, Instant.EPOCH.plusSeconds(3700)).chargedHours());
    }
}
