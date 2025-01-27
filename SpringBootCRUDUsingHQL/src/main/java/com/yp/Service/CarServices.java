package com.yp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yp.Entity.Car;
import com.yp.Repository.CarRepository;

@Service
public class CarServices {

	@Autowired
	CarRepository cr;
	
	public String InsertData(Car c)
	{
		return cr.InsertData(c);
	}
	
	public String UpdateData(Car c, int id)
	{
		return cr.UpdateData(c, id);
	}
	
	public String DeleteData(int id)
	{
		return cr.DeleteData(id);
	}
	
	public Car GetSingleData(int id)
	{
		return cr.GetSingleData(id);
	}
	
	public List<Car> GetAllData()
	{
		return cr.GetAllData();
	}
}
