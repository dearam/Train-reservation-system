import java.util.*;
public class Sample{
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> temp=new ArrayList<Integer>();
		temp.add(234);
		b.add(8);
		System.out.println(b);
		b=temp;
		System.out.println(b);
		a.add(b);
		a.add(b);
		ArrayList<ArrayList<Integer>> c=a;
		a.get(1).set(0,2);
		System.out.println(c);
		// int a=10;
		// String s=a+"";
		// System.out.println(s);
	}
}