package demo.testexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.testexample.model.AnimalModel;

import demo.testexample.repository.AnimalRepository;

@Component("impl1")
public class AnimalServiceImpl1 implements AnServiceInterface {
	@Autowired
	AnimalRepository animalRepository;
	@Override
	public List<AnimalModel> getAllAnimal() {
		List<AnimalModel> findAll = (List<AnimalModel>) animalRepository.findAll();
		return findAll;
	}
	@Override
	public void postanimal(AnimalModel a) {
		animalRepository.save(a);
		
	}
	@Override
	public void updateanimal(Integer id, AnimalModel a) {
		Optional<AnimalModel> findById = animalRepository.findById(id);
		AnimalModel animalModel = findById.get();
		animalModel.setId(a.getId());
		animalModel.setName(a.getName());
		animalModel.setColour(a.getColour());
		
		animalRepository.save(animalModel);
		
	}
@Override
	public void deleteanimal(Integer id) {
		animalRepository.deleteById(id);
		
	}
		
	}


