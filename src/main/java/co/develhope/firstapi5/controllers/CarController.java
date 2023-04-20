package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController{
	@GetMapping("/cars")
	public CarDTO getRequest(@RequestParam String id, @RequestParam String modelName, @RequestParam(required = false) Double price){
		return new CarDTO(id, modelName, price);
	}
	@PostMapping("/cars")
	public String postRequest(@RequestBody CarDTO carDTO) {
			return carDTO.toString()+"\n"+String.valueOf(HttpStatus.CREATED);
	}
}