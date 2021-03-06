package day2;

public class ASSESE {public static void main(String[] args) {
	Employee employee=new
			CommissionEmployee(121, "amit", 2.1, 2000000);
	Invoice invoice=new Invoice("A123", "Electronic23W", 20, 3000);
	
	PaymentProcessingSystem.processPayment(employee);
}


}public class CommissionEmployee extends Employee {
	private double commisionPercentage;
	private double totalSales;

	public CommissionEmployee(int id, String name, double commisionPercentage, double totalSales) {
		super(id, name);
		this.commisionPercentage = commisionPercentage;
		this.totalSales = totalSales;
	}

	@Override
	public double getPayment() {
		return totalSales * commisionPercentage / 100;
	}

}
abstract class Employee implements Payable{
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	abstract public double getPayment() ;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class HourlyEmployee extends Employee{
	private double  hourlyRate;
	private int numberOfHours;
	
	public HourlyEmployee(int id, String name,double  hourlyRate,
	 int numberOfHours ) {
		super(id, name);
		this.hourlyRate=hourlyRate;
		this.numberOfHours=numberOfHours;
	}

	@Override
	public String toString() {
		return super.toString()+
				"HourlyEmployee [hourlyRate=" + hourlyRate + ", "
				+ "numberOfHours=" + numberOfHours + "]";
	}

	@Override
	public double getPayment() {
		return hourlyRate*numberOfHours;
	}
	
	
	
}
public class Invoice implements Payable {
	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerPart;

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerPart() {
		return pricePerPart;
	}

	public void setPricePerPart(double pricePerPart) {
		this.pricePerPart = pricePerPart;
	}

	public Invoice(String partNum, String partDescription, int quantity, double pricePerPart) {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerPart = pricePerPart;
	}

	@Override
	public double getPayment() {
		return quantity*pricePerPart;
	}

}

public interface Payable {
	abstract public double getPayment();
}
public class PaymentProcessingSystem {
	
	public static void processPayment(Payable payable) {
		//logic to process payment to database
		//
		System.out.println("payment of total: "+ payable.getPayment()+" is processed");
	}

}
public class SalariedEmployee extends Employee{

	private double fixedWeeklySalary;
	public SalariedEmployee(int id, String name, double fixedWeeklySalary) {
		super(id, name);
		this.fixedWeeklySalary=fixedWeeklySalary;
	}
	@Override
	public double getPayment() {
		return fixedWeeklySalary;
	}

	
}

