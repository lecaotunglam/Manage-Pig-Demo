package qhp.demo.managepig.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import qhp.demo.managepig.entity.Pig;

import java.util.List;

@Repository
public interface PigRepository extends CrudRepository<Pig, Integer> {

    List<Pig> findByPigidContaining(String term);

}
