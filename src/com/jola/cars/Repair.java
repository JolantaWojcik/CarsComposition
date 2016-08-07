package com.jola.cars;
import java.util.Date;


public class Repair {
	
	/*naprawa posiada: datê naprawy, opis czynnoœci serwisowej, przebieg auta w momencie awarii, 
	kwotê naprawy, nazwisko serwisanta odpowiedzialnego za naprawê*/
	
	private int yearOfService;
	private int monthOfService;
	private int dayOfService;
	private String serviceOperations;
	private double price;
	private String mechanic;
	private Car car;
	
	public Repair(int yearOfService, int monthOfService, int dayOfService, String serviceOperations, double price,
			String mechanic) {
		super();
		this.yearOfService = yearOfService;
		this.monthOfService = monthOfService;
		this.dayOfService = dayOfService;
		this.serviceOperations = serviceOperations;
		this.price = price;
		this.mechanic = mechanic;
	}

	public int getYearOfService() {
		return yearOfService;
	}

	public void setYearOfService(int yearOfService) {
		this.yearOfService = yearOfService;
	}

	public int getMonthOfService() {
		return monthOfService;
	}

	public void setMonthOfService(int monthOfService) {
		this.monthOfService = monthOfService;
	}

	public int getDayOfService() {
		return dayOfService;
	}

	public void setDayOfService(int dayOfService) {
		this.dayOfService = dayOfService;
	}

	public String getServiceOperations() {
		return serviceOperations;
	}

	public void setServiceOperations(String serviceOperations) {
		this.serviceOperations = serviceOperations;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMechanic() {
		return mechanic;
	}

	public void setMechanic(String mechanic) {
		this.mechanic = mechanic;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dayOfService;
		result = prime * result + ((mechanic == null) ? 0 : mechanic.hashCode());
		result = prime * result + monthOfService;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((serviceOperations == null) ? 0 : serviceOperations.hashCode());
		result = prime * result + yearOfService;
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
		Repair other = (Repair) obj;
		if (dayOfService != other.dayOfService)
			return false;
		if (mechanic == null) {
			if (other.mechanic != null)
				return false;
		} else if (!mechanic.equals(other.mechanic))
			return false;
		if (monthOfService != other.monthOfService)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (serviceOperations == null) {
			if (other.serviceOperations != null)
				return false;
		} else if (!serviceOperations.equals(other.serviceOperations))
			return false;
		if (yearOfService != other.yearOfService)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Repair [yearOfService=" + yearOfService + ", monthOfService=" + monthOfService + ", dayOfService="
				+ dayOfService + ", serviceOperations=" + serviceOperations + ", price=" + price + ", mechanic="
				+ mechanic + "]";
	}
	
	
}
