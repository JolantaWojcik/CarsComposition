package com.jola.cars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

	/*
	 * - znajdz samochód który mia³ najwiêcej napraw - znajdz samochód który
	 * mia³ najdro¿sz¹ naprawê - znajdŸ najdro¿sz¹ naprawê - oblicz kwotê napraw
	 * w danym miesi¹cu/roku - metoda double calculateTotalServiceCostFor(int
	 * month, int year, List<Car> cars)
	 */

	public Car getCarWithMostRepairs(List<Car> cars) {
		return cars.stream().collect(Collectors.maxBy((o1, o2) -> o1.getRepairs().size() - o2.getRepairs().size()))
				.get();

	}

	public Car getCarWithHighestRepairCost(List<Repair> repairs) {
		Repair repair = repairs.stream()
				.collect(Collectors.maxBy((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()))).get();
		return repair.getCar();

	}

	public Repair getHighestRepairCost(List<Repair> repairs) {
		return repairs.stream().collect(Collectors.maxBy(new Comparator<Repair>() {

			@Override
			public int compare(Repair o1, Repair o2) {
				return (int) o1.getPrice() - (int) o2.getPrice();
			}
		})).get();
	}

	public double calculateTotalServiceCostFor(int month, int year, List<Repair> repairs) {
		return repairs.stream().filter(e -> e.getYearOfService() == year && e.getMonthOfService() == month)
				.collect(Collectors.summingDouble(Repair::getPrice));
	}
	// { //return source.stream().filter(c ->
	// c.getPosition().equals(position)).collect(Collectors.averagingDouble(n->n
	// .getSalary())); // repairs.stream() //convert list to stream
	// //.filter(((c-> c.getMonthOfService())=month) &&
	// ((b->b.getYear_of_production())=year) //filters the line, equals to
	// //.collect(Collectors.averagingDouble(n->n.getPrice()))); //collect the
	// output and convert streams to a List //
	// if(repairs.getMonthOfService().size()==month &&
	// repairs.getYearOfService()==year) // return
	// repairs.stream().filter(c->c.getMonthOfService()==month &&
	// c.getYearOfService()==year) // .findAny() //.orElse(null) //
	// .collect(Collectors.averagingDouble(n->n.getPrice())); // }

}
