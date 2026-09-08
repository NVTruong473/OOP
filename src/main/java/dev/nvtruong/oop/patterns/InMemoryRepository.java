package dev.nvtruong.oop.patterns;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public final class InMemoryRepository<ID, T> {
    private final Map<ID, T> data = new LinkedHashMap<>();
    private final Function<T, ID> idExtractor;

    public InMemoryRepository(Function<T, ID> idExtractor) {
        this.idExtractor = Objects.requireNonNull(idExtractor);
    }

    public boolean add(T entity) {
        Objects.requireNonNull(entity);
        return data.putIfAbsent(idExtractor.apply(entity), entity) == null;
    }

    public T get(ID id) { return data.get(id); }

    public boolean remove(ID id) { return data.remove(id) != null; }

    public List<T> all() { return List.copyOf(data.values()); }

    public List<T> matching(Specification<T> specification) {
        return data.values().stream().filter(specification.asPredicate()).toList();
    }
}
