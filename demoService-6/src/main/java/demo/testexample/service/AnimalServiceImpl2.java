package demo.testexample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import demo.testexample.model.AnimalModel;
@Component("impl2")
public class AnimalServiceImpl2 implements AnServiceInterface {

	@Override
	public List<AnimalModel> getAllAnimal() {
		AnimalModel animalModel =new AnimalModel(11,"fox","brown");
		AnimalModel animalModel2 =new AnimalModel(12,"ox","white");
		List<AnimalModel> list = new ArrayList();
		list.add(animalModel);
		list.add(animalModel2);
		return list;
	}

	@Override
	public void postanimal(AnimalModel a) {
		
		
	}

	@Override
	public void updateanimal(Integer id, AnimalModel a) {

		
	}

	@Override
	public void deleteanimal(Integer id) {
		
		
	}

}
