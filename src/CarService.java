import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
	
	/*	- znajdz samochód który mia³ najwiêcej napraw
		- znajdz samochód który mia³ najdro¿sz¹ naprawê
		- znajdŸ najdro¿sz¹ naprawê
		- oblicz kwotê napraw w danym miesi¹cu/roku - metoda double calculateTotalServiceCostFor(int month, int year, List<Car> cars)*/
	
	public Car getCarWithMostRepairs(List<Repair> repair) {
	//	return cars.stream().collect(Collectors.maxBy((a, b) -> a.getRepairs() - b.getRepairs())).get();
		return repair.stream().collect(Collectors.maxBy((a, b) -> a.getRepairs()- b.getRepairs())).get();
	}
	public Employee getEmpWithHighestSalary(List<Employee> source) {
		return source.stream().collect(Collectors.maxBy((a, b) -> (int) a.getSalary()- (int) b.getSalary())).get();
	}
	
	public Car getCarWithHighestRepairCost(Car car, List<Repair> repairs) {
		//return source.stream().filter(c -> c.getPosition().equals(position)).collect(Collectors.averagingDouble(n->n.getSalary()));
		return repairs.stream().collect(Collectors.maxBy((a, b) -> (int) a.getPrice() -  (int b.getPrice())).get();
	}
	
	public Car getHighestRepairCost(List<Car> cars) {
		return cars.stream().collect(Collectors.maxBy((a, b) ->  (int) a.getCost_of_repair()- (int) b.getCost_of_repair())).get();
	}
	
	public double calculateTotalServiceCostFor(int month, int year, List<Car> car){
		//return source.stream().filter(c -> c.getPosition().equals(position)).collect(Collectors.averagingDouble(n->n.getSalary()));
		return car.stream().filter.((c->c.getMonthOfService().equals(month)),
				(b->b.getYear_of_production().equals(year))).collect(Collectors.averagingDouble(n->n.getCar())));
	}
	
}
