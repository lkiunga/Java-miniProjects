// import packages
import java.lang.*;// Not really necessary but good practise
import java.util.*;
//everything in java falls inside Java classes
//Class name has to be the same has file name
class MyFirst
{
	//main method that executes and call the program
	//we cannot use a class unless we have created objects
	//to use anything without creating an object ensure the method is estableshed has static
	//command line arguments- have to be passed
	//
	public static void main(String arg[])
	{
		// println is a method for printing anything on the screen
		// Has to start with capital letter
		// System -Class
		// out - object
		// println is a method
		System.out.println("Hello World");
		System.out.println(arg[0]);//arg[]process command line arguments
		Scanner s =new Scanner(System.in);
		int a, b ;
		System.out.println("Enter 2  number");
		a = s.nextInt();
		b = s.nextInt();

		System.out.println("The total is = " + (a+b));
	}
}
