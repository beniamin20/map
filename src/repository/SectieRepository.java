package repository;

import model.*;

import java.util.Collection;
import java.util.Map;

public class SectieRepository extends  AbstractCrudRepository<Sectie, ID> {

    public SectieRepository(Map<String, Sectie> entitati) {
        super(entitati);
    }

    @Override
    public long size() {
        return super.size();
    }

    @Override
    public Sectie add(Sectie entity) {
        return super.add(entity);
    }

    @Override
    public Sectie update(Sectie entity) {
        try {
            return super.update(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
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
    public Collection<Sectie> findAll() {
        return super.findAll();
    }
}
