package demo.testexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.testexample.model.AnimalModel;
import demo.testexample.service.AnServiceInterface;
import demo.testexample.service.AnimalServiceImpl1;

@RestController
@RequestMapping("animal")
public class AnimalController {

	@Autowired
	@Qualifier("impl2")
	AnServiceInterface anServiceInterface;

	@GetMapping("/getall")
	public List<AnimalModel> getAllAnimal() {
		List<AnimalModel> lst = anServiceInterface.getAllAnimal();
		return lst;
	}
	
	@PostMapping("/post")
	public String postanimal(@RequestBody AnimalModel a) {
		anServiceInterface.postanimal(a);
		return "animal saved successfully";
		}
	@PutMapping("/put/{id}")
	public String updateanimal(@PathVariable Integer id,@RequestBody AnimalModel a) {
		anServiceInterface.updateanimal(id,a);
    	return " animal updated successfully";

}
	 @DeleteMapping("/delete/{id}")
	    public String deleteanimal(@PathVariable Integer id) {
		 anServiceInterface.deleteanimal(id);
	    	return " animal deleted successfully";
	    }

	}
