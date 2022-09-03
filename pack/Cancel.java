package pack;
import java.util.*;
public class Cancel{
	int id=0;
	ArrayList<ArrayList<String>> h=new ArrayList<ArrayList<String>>();
	String b="";
	public Cancel(ArrayList database){
		ArrayList<ArrayList<String>> here=database;
		h=here;
		Scanner sc=new Scanner(System.in);
		System.out.println("Type the id of the customer");
		id=sc.nextInt();
		sc.nextLine();
		// String temp=here.get(id-1).get(3);
		int r=7,rac=0,wait=0;
		for(int i=0;i<here.size();i++){
			for(int j=0;j<(here.get(i)).size();j++){
				if(j==0){
						int check=Integer.parseInt(here.get(i).get(j));
						if(check==id){
							r=i;
						}
					}
				if(here.get(i).get(j).equals("rac")){
					rac=i;
				}
				if(here.get(i).get(j).equals("waiting")){
					wait=i;
				}
			}
		}
		if(r!=7){
			String berth=here.get(r).get(3);
			b=berth;
			if(berth.equals("rac")){
				if(wait!=0){
					here.get(wait).set(3,"rac");
				}
				here.remove(r);
			}
			else{
				here.get(rac).set(3,berth);
				if(wait!=0){
					here.get(wait).set(3,"rac");
				}
				here.remove(r);
			}
			System.out.println("---Succesfully cancelled the booking---");
		}
		else{
			System.out.println("-------------ID not present------------");
		}
	}
	public ArrayList<ArrayList<String>> getAlterate(){
		return h;
	}
	public int getCancel(){
		return id;
	}
	public String getCancelBerth(){
		return b;
	}
}