package day2;
 class Student{

	int rollno;
	String name;
	double weight;
	Student(int rollno,String name,double weight)
	{
		this.rollno=rollno;
		this.name=name;
		this.weight=weight;
	}
}
class Inheritance extends Student{
	double percentage;

	Inheritance(int rollno, String name, double weight,double percentage) {
		super(rollno, name, weight);
		this.percentage=percentage;
		// TODO Auto-generated constructor stub
	}

void shownow()
{
	System.out.println("rollno is:"+rollno+"name is"+name+"weight is :"+weight+"percentage is:"+percentage);
}



	public static void main(String args[])
	{
		Inheritance a=new Inheritance(1,"TOSHU",40,99);
		a.shownow();
		
	}
}

