package com.yp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yp.Entity.Car;
import com.yp.Service.CarServices;

@RestController
@RequestMapping("/Car")
public class CarController {

	@Autowired
	CarServices cs;
	
	@PostMapping("/insertData")
	public String InsertData(@RequestBody Car c)
	{
		return cs.InsertData(c);
	}
	
	@PutMapping("/updateData/{Id}")
	public String UpdateData(@RequestBody Car c, @PathVariable("Id") int id)
	{
		return cs.UpdateData(c, id);
	}
	
	@DeleteMapping("/deleteData/{Id}")
	public String DeleteData(@PathVariable("Id") int id)
	{
		return cs.DeleteData(id);
	}
	
	@GetMapping("/getSingleData/{Id}")
	public Car GetSingleData(@PathVariable("Id") int id)
	{
		return cs.GetSingleData(id);
	}
	
	@GetMapping("/getAllData")
	public List<Car> GetAllData()
	{
		return cs.GetAllData();
	}
}
