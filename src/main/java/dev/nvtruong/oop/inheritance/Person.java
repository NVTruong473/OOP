package dev.nvtruong.oop.inheritance;

public class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name must not be blank");
        if (address == null || address.isBlank()) throw new IllegalArgumentException("address must not be blank");
        this.name = name.trim();
        this.address = address.trim();
    }

    public String name() { return name; }
    public String address() { return address; }

    @Override public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ",address=" + address + "]";
    }
}
