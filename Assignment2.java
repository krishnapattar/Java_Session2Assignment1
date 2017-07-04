import java.util.Scanner;

/*
 * This class will print the greater value among 3 input values
 */
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner ( System.in);
		System.out.println("Enter any 3 numbers: ");//asking for input any 3 numbers
		int a =s.nextInt();//input first value
		int b =s.nextInt();//input second value
		int c =s.nextInt();//input third value

	if (a>b){ //comparing a and b inputs
		
		if(a>c){//comparing a and c inputs
		
			System.out.println("largest value is :"+a);//print a value
		}
		else{
			System.out.println("largest value is :"+c);//print c value
		}
	}
	else
	{ if (c>b){//comparing a and b inputs
		System.out.println("largest value is :"+c);//print c value
	
	}
	else{
		System.out.println("largest value is :"+b);//print b value
	}
	}
	}
	}
