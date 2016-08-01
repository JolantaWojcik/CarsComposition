import java.util.Date;

public class Car {
	/*Stworz relacje jeden - do - wiele miêdzy klas¹ Car oraz Repair 
	 * (samochód mo¿e mieæ wiele napraw, naprawa dotyczy zawsze jednego samochodu) 
	 * - mamy tu zatem kompozycje - naprawa nie mo¿e istnieæ bez samochodu i nie mo¿e byæ wspó³dzielona miêdzy samochodami.
		Samochód posiada: rok produkcji, marka, model przebieg,*/
	private Date year_of_production;
	private String model;
	private int mileage;
	private int number_of_repairs;
	//private Repair cost_of_repair;
	//nie zbyt poprawna wersja?
	private double cost_of_repair;
	private Date date;
	private Repair repair = new Repair();
	
	public Car(Date year_of_production, String model, int mileage, int number_of_repairs,
			double cost_of_repair, Date date) {
		super();
		this.year_of_production = year_of_production;
		this.model = model;
		this.mileage = mileage;
		this.date = date;
		this.setNumber_of_repairs(number_of_repairs);
		this.cost_of_repair = cost_of_repair;
	}
	
	public double getCost_of_repair() {
		return cost_of_repair;
	}

	public void setCost_of_repair(double cost_of_repair) {
		this.cost_of_repair = repair.getPrice();
	}

	public Date getYear_of_production() {
		return year_of_production;
	}
	public void setYear_of_production(Date year_of_production) {
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

	public int getNumber_of_repairs() {
		return number_of_repairs;
	}

	public void setNumber_of_repairs(int number_of_repairs) {
		//this.number_of_repairs = repair.getCounter();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = repair.getDate_of_repaire();
	}

	
	
	
}
