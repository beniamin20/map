package repository;

import java.util.Map;

public abstract class AbstractCrudRepository<E extends HasID<ID>, ID> implements Repository<E, ID> {

    private Map<String, E> entitati;

    public AbstractCrudRepository() {
    }

    public AbstractCrudRepository(Map<String, E> entitati) {
        this.entitati = entitati;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public E save(E entity) {
        return null;
    }

    @Override
    public E delete(ID id) {
        return null;
    }

    @Override
    public E findOne(ID id) {
        return null;
    }

    @Override
    public Iterable<E> findAll() {
        return null;
    }
}
