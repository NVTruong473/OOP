package dev.nvtruong.oop;

import dev.nvtruong.oop.inheritance.*;
import dev.nvtruong.oop.model.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelAndInheritanceTest {
    @Test void modelsLegacyClassesWithInvariants() {
        assertEquals(5.0, new Point2D(0,0).distanceTo(new Point2D(3,4)), 1e-9);
        Rectangle rectangle = new Rectangle(3,4);
        assertEquals(12, rectangle.area());
        assertEquals(14, rectangle.perimeter());
        assertEquals("Ada Lovelace", new Student(1, "Ada", "Lovelace").fullName());

        House house = new House("A01", 3, true,
                new BigDecimal("100"), new BigDecimal("2500000"));
        assertEquals(new BigDecimal("316250000.00"), house.sellingPrice());

        assertEquals(new Fraction(5,6), new Fraction(1,2).add(new Fraction(1,3)));
        assertEquals(12, new RegularPolygon(4,3).perimeter());
    }

    @Test void demonstratesInheritanceAndPolymorphism() {
        Cylinder cylinder = new Cylinder(2, 5);
        assertEquals(Math.PI * 20, cylinder.volume(), 1e-9);

        Shape square = new Square(4);
        assertEquals(16, square.area());

        Employee employee = new Manager("M1", "Truong", 1000, 250);
        assertEquals(1250, employee.salary());

        Car car = new LuxuryCar("LX", 100_000, 0.2);
        assertEquals(120_000, car.price(), 1e-9);

        List<Learner> learners = List.of(
                new ITStudent("A", 9),
                new ITStudent("B", 6),
                new MathStudent("C", 8.5),
                new MathStudent("D", 4));
        assertEquals("C", StudentProcessing.maxMathStudent(learners).name());
        assertEquals(1, StudentProcessing.itStudentsAtOrAboveOwnAverage(learners).size());
    }
}
