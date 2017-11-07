package repository;

import java.util.Collection;

public interface Repository<E, ID> {
    long size();
    E add(E entity);
    E update(E entity) throws Exception;
    E delete(ID id);
    E findOne(ID id);
    Collection<E> findAll();
}
