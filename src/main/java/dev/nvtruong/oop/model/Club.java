package dev.nvtruong.oop.model;

import java.util.LinkedHashSet;
import java.util.Set;

public final class Club {
    private final String name;
    private final Set<String> members = new LinkedHashSet<>();

    public Club(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name must not be blank");
        this.name = name.trim();
    }

    public String name() { return name; }
    public boolean join(String member) { return members.add(requireMember(member)); }
    public boolean leave(String member) { return members.remove(requireMember(member)); }
    public int size() { return members.size(); }
    public Set<String> members() { return Set.copyOf(members); }

    private String requireMember(String member) {
        if (member == null || member.isBlank()) throw new IllegalArgumentException("member must not be blank");
        return member.trim();
    }
}
