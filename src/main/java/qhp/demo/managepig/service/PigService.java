package qhp.demo.managepig.service;

import java.util.List;

import qhp.demo.managepig.entity.Pig;

public interface PigService {

    Iterable<Pig> findAll();

    List<Pig> search(String term);

    Pig findOne(Integer id);

    void save(Pig pig);

    void delete(Integer id);

}
