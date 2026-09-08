package dev.nvtruong.oop.patterns;

import java.util.List;
import java.util.Objects;

public final class RuleEngine<T> {
    public interface Rule<T> {
        boolean matches(T value);
        String violation();
    }

    private final List<Rule<T>> rules;

    public RuleEngine(List<Rule<T>> rules) {
        this.rules = List.copyOf(rules);
    }

    public List<String> validate(T value) {
        Objects.requireNonNull(value);
        return rules.stream().filter(rule -> !rule.matches(value)).map(Rule::violation).toList();
    }

    public boolean isValid(T value) {
        return validate(value).isEmpty();
    }
}
