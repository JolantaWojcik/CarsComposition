package com.jola.cars;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
	/*Stworz relacje jeden - do - wiele miêdzy klas¹ Car oraz Repair 
	 * (samochód mo¿e mieæ wiele napraw, naprawa dotyczy zawsze jednego samochodu) 
	 * - mamy tu zatem kompozycje - naprawa nie mo¿e istnieæ bez samochodu i nie mo¿e byæ wspó³dzielona miêdzy samochodami.
		Samochód posiada: rok produkcji, marka, model przebieg,*/
	//moze miec wiele napraw
	private List<Repair> repairs;
	private int year_of_production;
	private String model;
	private int mileage;
	
	public Car(int year_of_production, String model, int mileage) {
		super();
		this.repairs = new ArrayList<>();
		this.year_of_production = year_of_production;
		this.model = model;
		this.mileage = mileage;
	}
	
	public void addRepair(Repair rep) {
		repairs.add(rep);
		rep.setCar(this);
	}

	public List<Repair> getRepairs() {
		return repairs;
	}

	public void setRepairs(List<Repair> repairs) {
		this.repairs = repairs;
	}

	public int getYear_of_production() {
		return year_of_production;
	}

	public void setYear_of_production(int year_of_production) {
		this.year_of_production = year_of_production;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mileage;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + year_of_production;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (mileage != other.mileage)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year_of_production != other.year_of_production)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [year_of_production=" + year_of_production + ", model=" + model + ", mileage=" + mileage + "]";
	}

	
}
