package repository;

public interface Repository<E, ID> {
    long size();
    E save(E entity);
    E delete(ID id);
    E findOne(ID id);
    Iterable<E> findAll();
}
