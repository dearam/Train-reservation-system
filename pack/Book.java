package pack;
import java.util.*;
public class Book{
	int age,b;
	String name,berth;
	public Book(){
		System.out.println("Enter name,age,berth");
		System.out.println("---------------berths--------------");
		System.out.println("---lower,midle,upper,rac,waiting---");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name :");
		name=sc.nextLine();
		System.out.print("Enter age :");
		age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter berth :");
		berth=sc.nextLine();
		if(berth.equals("lower")){
			b=0;
		}
		else if(berth.equals("midle")){
			b=1;
		}
		else if(berth.equals("upper")){
			b=2;
		}
		else if(berth.equals("rac")){
			b=3;
		}
		else if(berth.equals("waiting")){
			b=4;
		}
		System.out.println("---Succesfully booked---");
	}
	public String getAge(){
		String temp=age+"";
		return temp;
	}
	public String getName(){
		return name;
	}
	public int getberth(){
		return b;
	}
}