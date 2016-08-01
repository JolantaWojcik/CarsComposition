import java.util.Date;

public class Repair {
	
	/*naprawa posiada: datê naprawy, opis czynnoœci serwisowej, przebieg auta w momencie awarii, 
	kwotê naprawy, nazwisko serwisanta odpowiedzialnego za naprawê*/
	
	private Date date_of_repaire;
	private String service_operations;
	private int mileage;
	private double price;
	private String mechanic;
	
	//zle
	public static int counter = 0;
	public Repair()
	{
	    counter++;
	}
	
	public int getCounter() {
	    return counter;
	}
	
	public Repair(Date date_of_repaire, String service_operations, int mileage, double price, String mechanic) {
		super();
		this.date_of_repaire = date_of_repaire;
		this.service_operations = service_operations;
		this.mileage = mileage;
		this.price = price;
		this.mechanic = mechanic;
	}

	public Date getDate_of_repaire() {
		return date_of_repaire;
	}

	public void setDate_of_repaire(Date date_of_repaire) {
		this.date_of_repaire = date_of_repaire;
	}

	public String getService_operations() {
		return service_operations;
	}

	public void setService_operations(String service_operations) {
		this.service_operations = service_operations;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_of_repaire == null) ? 0 : date_of_repaire.hashCode());
		result = prime * result + ((mechanic == null) ? 0 : mechanic.hashCode());
		result = prime * result + mileage;
	//	result = prime * result + price;
		result = prime * result + ((service_operations == null) ? 0 : service_operations.hashCode());
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
		if (date_of_repaire == null) {
			if (other.date_of_repaire != null)
				return false;
		} else if (!date_of_repaire.equals(other.date_of_repaire))
			return false;
		if (mechanic == null) {
			if (other.mechanic != null)
				return false;
		} else if (!mechanic.equals(other.mechanic))
			return false;
		if (mileage != other.mileage)
			return false;
		if (price != other.price)
			return false;
		if (service_operations == null) {
			if (other.service_operations != null)
				return false;
		} else if (!service_operations.equals(other.service_operations))
			return false;
		return true;
	}

}
