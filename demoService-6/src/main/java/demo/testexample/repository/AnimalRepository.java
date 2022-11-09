package demo.testexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.testexample.model.AnimalModel;

@Repository
public interface AnimalRepository  extends CrudRepository<AnimalModel, Integer> {

}
