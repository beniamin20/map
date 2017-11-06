package repository;

import model.*;

import java.util.Map;

public class SectieRepository extends  AbstractCrudRepository<Sectie, ID> {

    public SectieRepository() {
    }

    public SectieRepository(Map<String, Sectie> entitati) {
        super(entitati);
    }

    @Override
    public long size() {
        return super.size();
    }

    @Override
    public Sectie save(Sectie entity) {
        return super.save(entity);
    }

    @Override
    public Sectie delete(ID id) {
        return super.delete(id);
    }

    @Override
    public Sectie findOne(ID id) {
        return super.findOne(id);
    }

    @Override
    public Iterable<Sectie> findAll() {
        return super.findAll();
    }
}
