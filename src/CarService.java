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
	
	public Car getCarWithMostRepairs(List<Car> cars) {
		return cars.stream().collect(Collectors.maxBy((a, b) -> a.getNumber_of_repairs() - b.getNumber_of_repairs())).get();
	}
	
	public Car getCarWithHighestRepairCost(List<Car> cars) {
		//return source.stream().filter(c -> c.getPosition().equals(position)).collect(Collectors.averagingDouble(n->n.getSalary()));
		return cars.stream().collect(Collectors.maxBy((a, b) -> (int) a.getCost_of_repair()-  (int) b.getCost_of_repair())).get();
	}
	
	public Car getHighestRepairCost(List<Car> cars) {
		return cars.stream().collect(Collectors.maxBy((a, b) ->  (int) a.getCost_of_repair()- (int) b.getCost_of_repair())).get();
	}
	
	public double calculateTotalServiceCostFor(int month, int year, List<Car> car) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
		Date utilDate = formatter.parse(year + "/" + month);
		
		return car.stream().filter(c -> c.getDate().equals(utilDate)).collect(Collectors.averagingDouble(n->n.getCost_of_repair()));
	}
	
}
