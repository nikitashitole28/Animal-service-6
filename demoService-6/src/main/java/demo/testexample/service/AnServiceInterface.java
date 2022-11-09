package demo.testexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.testexample.model.AnimalModel;
@Service
public interface AnServiceInterface {

	List<AnimalModel> getAllAnimal();

	void postanimal(AnimalModel a);

	void updateanimal(Integer id, AnimalModel a);

	void deleteanimal(Integer id);

}
