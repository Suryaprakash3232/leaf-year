import java.io.*;
import java.util.Scanner;
class leapyear {  

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a year: ");
	int year;
	year= input.nextInt();
	if (year%4==0 && year%400==0){
		System.out.println("It is a Leap year.");
	}
	else if (year%100==0 && year%400!=0){
		System.out.println("It is not a Leap year.");
	}
	else{
		System.out.println("It is not a Leap year.");

	}
	
    }  
}