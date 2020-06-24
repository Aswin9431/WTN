package Classesandobjects;

public class Calculator {
	static int powerInt(int a,int b)
	{
	return (int) Math.pow(a,b);	
	}
	static double powerDouble(double a,double b)
	{
	return (double) Math.pow(a,b);	
	}
	public static void main(String[] args) {
	System.out.println(powerInt(2,3));
	System.out.println(powerDouble(2.5,9.5));
	}
}
