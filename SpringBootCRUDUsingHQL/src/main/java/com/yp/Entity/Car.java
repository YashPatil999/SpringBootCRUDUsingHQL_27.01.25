package com.yp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carMake;
	private String carModel;
	private String carNumber;
	private double carRent;

	public Car() {

	}

	public Car(int carId, String carMake, String carModel, String carNumber, double carRent) {
		super();
		this.carId = carId;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.carRent = carRent;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public double getCarRent() {
		return carRent;
	}

	public void setCarRent(double carRent) {
		this.carRent = carRent;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carMake=" + carMake + ", carModel=" + carModel + ", carNumber=" + carNumber
				+ ", carRent=" + carRent + "]";
	}

}
