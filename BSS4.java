package day2;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class BSS4 {

	public static void main(String[] args) {

	BSS4 address=new BSS4
			class Employee implements Serializable {
		private static final long serialVersionUID = 1L;

		private int id;
		private String name;
		private Address address;
		transient private double salary;

		public Employee(int id, String name, Address address, int salary) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

	}("A21, Preet vihar", "delhi", "India");
		Employee employee=
				new Employee(121, "raj", address, 400000);
		
		//Serilization
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("temp.ser")));
			oos.writeObject(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Deserilization
		employee=null;
		try {
			ObjectInputStream oos=new ObjectInputStream(new FileInputStream(new File("temp.ser")));
			employee=(Employee) oos.readObject();
			System.out.println(employee);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}


