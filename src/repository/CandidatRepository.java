package repository;

import model.*;

import java.util.Map;

public class CandidatRepository extends  AbstractCrudRepository<Candidat, ID> {

    public CandidatRepository() {
    }

    public CandidatRepository(Map<String, Candidat> entitati) {
        super(entitati);
    }

    @Override
    public long size() {
        return super.size();
    }

    @Override
    public Candidat save(Candidat entity) {
        return super.save(entity);
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
    public Iterable<Candidat> findAll() {
        return super.findAll();
    }
}
