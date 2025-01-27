package com.yp.Repository;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yp.Entity.Car;

@Repository
public class CarRepository {

	@Autowired
	SessionFactory sf;
	
	public String InsertData(Car c)
	{
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "insert into Car (carMake,carModel,carNumber,carRent) values (:make, :model, :number, :rent)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("make", c.getCarMake());
		query.setParameter("model", c.getCarModel());
		query.setParameter("number", c.getCarNumber());
		query.setParameter("rent", c.getCarRent());
		query.executeUpdate();
		tr.commit();
		ss.close();
		return "Data Added Successfully!!!";
	}
	
	public String UpdateData(Car c, int id)
	{
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "update Car set carMake = :make, carModel = :model, carNumber = :number, carRent = :rent where carId = :id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("make", c.getCarMake());
		query.setParameter("model", c.getCarModel());
		query.setParameter("number", c.getCarNumber());
		query.setParameter("rent", c.getCarRent());
		query.setParameter("id", id);
		query.executeUpdate();
		tr.commit();
		ss.close();
		return "Data Updated Successfully!!!";
	}
	
	public String DeleteData(int id)
	{
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete Car where carId = :id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", id);
		query.executeUpdate();
		tr.commit();
		ss.close();
		return "Data Deleted Successfully!!!";
	}
	
	public Car GetSingleData(int id)
	{
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Car where carId = :id";
		Query<Car> query = ss.createQuery(hqlQuery, Car.class);
		query.setParameter("id", id);
		Car c = query.getSingleResult();
		tr.commit();
		ss.close();
		return c;
	}
	
	public List<Car> GetAllData()
	{
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Car";
		Query<Car> query = ss.createQuery(hqlQuery, Car.class);
		List<Car> list = query.getResultList();
		
		Iterator<Car> iterator = list.iterator();
		
		 while (iterator.hasNext()) {
			 Car item = iterator.next();
	        }
		tr.commit();
		ss.close();
		return list;
	}
}
