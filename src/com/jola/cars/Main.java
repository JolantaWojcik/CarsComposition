package com.jola.cars;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
	
	/*nast�pnie w mainie stw�rz kilka danych testowych:
		(np.: 3-4 samochody i niech ka�dy ma po 0-5 napraw)
		
		- znajdz samoch�d kt�ry mia� najwi�cej napraw
		- znajdz samoch�d kt�ry mia� najdro�sz� napraw�
		- znajd� najdro�sz� napraw�
		- oblicz kwot� napraw w danym miesi�cu/roku - metoda double calculateTotalServiceCostFor(int month, int year, List<Car> cars)*/

	public static void main(String[] args) {
		 Repair rep = new Repair(1990, 9, 31, "desc", 567.87, "Kowalski");
		 Repair rep2 = new Repair(1990, 8, 31, "desc2", 567.87, "Nowak");
		 Repair rep3 = new Repair(1996, 8, 31, "desc3", 679.87, "Nowak");
		 Repair rep4 = new Repair(2000, 9, 31, "desc4", 789.87, "Kowalski");
		 Repair rep5 = new Repair(2010, 6, 31, "desc5", 567.87, "Kowalski");
		 
		 Car car = new Car(1988, "Fiat", 134);
		 Car car2 = new Car(1998, "Audi", 200);
		 Car car3 = new Car(2014, "Voltsvagen", 99);
		 
		 car.addRepair(rep);
		 car.addRepair(rep2);
		 car.addRepair(rep3);
		 car2.addRepair(rep4);
		 car2.addRepair(rep5);
		 
		 ArrayList<Repair> repairs = new ArrayList<>();
		 repairs.add(rep);
		 repairs.add(rep2);
		 repairs.add(rep3);
		 repairs.add(rep4);
		 repairs.add(rep5);
		 
		 ArrayList<Car> loCars = new ArrayList<Car>();
		 
		 loCars.forEach(System.out::println);

		loCars.add(car);
		loCars.add(car2);
		loCars.add(car3);

		CarService carService = new CarService();
		System.out.println("Car With Most Repairs: "+carService.getCarWithMostRepairs(loCars).toString());
		
		System.out.println("Car with hightes repairs price: "+carService.getCarWithHighestRepairCost(repairs).toString());
		
		System.out.println("CMost expensive repair: "+carService.getHighestRepairCost(repairs).toString());
	}

}
