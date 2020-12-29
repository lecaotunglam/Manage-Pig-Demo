package qhp.demo.managepig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qhp.demo.managepig.entity.Pig;
import qhp.demo.managepig.repository.PigRepository;

import java.util.List;

@Service
public class PigServiceImpl implements PigService {

    @Autowired
    private PigRepository pigRepository;

    @Override
    public Iterable<Pig> findAll() {
        return pigRepository.findAll();
    }

    @Override
    public List<Pig> search(String term) {
        return pigRepository.findByPigidContaining(term);
    }

    @Override
    public Pig findOne(Integer id) {
        return pigRepository.findOne(id);
    }

    @Override
    public void save(Pig pig) {
        pigRepository.save(pig);
    }

    @Override
    public void delete(Integer id) {
        pigRepository.delete(id);
    }
}
