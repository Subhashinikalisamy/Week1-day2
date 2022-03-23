package week1.day1.classroom;

public class Calculator {
	//int sum;
	//double sub;
	//double mul;
	//double div;
	
	public int add(int a, int b) 
{
		int sum=a+b;
		return sum;
	}
	public double sub(double d,double c)
	{
		double subr = d-c;
		return subr;
	}
	public double multiply(double f,double g)
	{
		double mul= f*g;
		return mul;
	}
	public int divide(int h,int i)
	{
		int div = (h/i);
		return div;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Calculator Cal= new Calculator();
		System.out.println(Cal.add(1,2));
		System.out.println(Cal.sub(2.5,1.5));
		System.out.println(Cal.multiply(3.5,1.5));
		System.out.println(Cal.divide(10,2));

	}

}
