package repository;

import model.*;

import java.util.Collection;
import java.util.Map;

public class CandidatRepository extends  AbstractCrudRepository<Candidat, ID> {

    public CandidatRepository(Map<String, Candidat> entitati) {
        super(entitati);
    }

    @Override
    public long size() {
        return super.size();
    }

    @Override
    public Candidat add(Candidat entity) {
        return super.add(entity);
    }

    @Override
    public Candidat update(Candidat entity) {
        try {
            return super.update(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }

    @Override
    public Candidat delete(ID id) {
        return super.delete(id);
    }

    @Override
    public Candidat findOne(ID id) {
        return super.findOne(id);
    }

    @Override
    public Collection<Candidat> findAll() {
        return super.findAll();
    }
}
