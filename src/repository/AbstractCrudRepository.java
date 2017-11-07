package repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class AbstractCrudRepository<E extends HasID<ID>, ID> implements Repository<E, ID> {

    private Map<String, E> entitati;

    public AbstractCrudRepository(Map<String, E> entitati) {
        this.entitati = entitati;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public E add(E entity) {
        entitati.putIfAbsent(entity.getId().toString(), entity);
        System.out.println(entity.getId().toString());
        return entity;
    }

    @Override
    public E update(E entity) throws Exception {
        if(entitati.get(entity.getId().toString()) != null) {
            entitati.put(entity.getId().toString(), entity);
            return entity;
        }

        return null;
    }

    @Override
    public E delete(ID id) {
        if(entitati.get(id.toString()) != null) {
            entitati.remove(id.toString());
            return entitati.get(id.toString());
        }

        return  null;
    }

    @Override
    public E findOne(ID id) {
        return  entitati.get(id.toString());
    }

    @Override
    public Collection<E> findAll() {
        return entitati.values();
    }
}
