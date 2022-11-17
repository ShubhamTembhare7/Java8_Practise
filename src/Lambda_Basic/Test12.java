package Lambda_Basic;
import java.util.Scanner;



	interface L1
			{
	void dataNum(int choise,int number);
	
	}


	public class Test12 {

	public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter your choise 1 : Area of Square");
	System.out.println("Enter your choise 2 : Area of the rectangle");


	System.out.println("Enter your choise:");
	int no1 = myObj.nextInt();

	System.out.println("Enter your No:");

	int number = myObj.nextInt();



	L1 obj1 =(cho,b)->{

	switch(cho) {
	case 1:

	int area_square= b*b;
	System.out.println("Area of the square:"+area_square);
	break;

	case 2:
	int height=2;
	int weight=b;
	int area= 2*weight;
	System.out.println("Area of the rectangle:"+area);

	break;

	}
	};

	obj1.dataNum(no1, number);
	}
	}

