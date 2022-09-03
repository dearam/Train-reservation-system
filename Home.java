import java.util.*;
import pack.Book;
import pack.Cancel;
public class Home{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String trains[]=new String[30];
		//berth-60 rac-18 waiting-10
		//lower midle upper rac waiting
		ArrayList<ArrayList<String>> database=new ArrayList<ArrayList<String>>();
		int[] available={1,1,1,1,1};
		String[] berths={"lower","midle","upper","rac","waiting"};
		int usrin=1;
		int ids=1;
		while(usrin==1){
			System.out.println("1 - To Book a ticket\n2 - To cancel a ticker\n3 - To show Booked ticked\n4 - To Show available tickets\n0 - To exit");
			usrin=sc.nextInt();
			if(usrin==1){
				Book a=new Book();
				int i=a.getberth();
				ArrayList<String> data=new ArrayList<String>();
				String tempid=ids+"";
				data.add(tempid);
				data.add(a.getName());
				data.add(a.getAge());
				while(available[i]==0){
					i++;
				}
				data.add(berths[i]);
				available[i]-=1;
				ids++;
				database.add(data);
			}
			else if(usrin==2){
				Cancel c=new Cancel(database);
				database=c.getAlterate();
				for(int i=0;i<berths.length;i++){
					if((c.getCancelBerth()).equals(berths[i])){
						available[i]++;
						break;
					}
				}
				usrin=1;
				// String alter=database.get((c.id)-1).get(3);
				// ArrayList.remove(c.getCancel(c.id));


			}
			else if(usrin==3){
				System.out.println("-------BOOKED TICKETS--------");
				System.out.println("-ID---NAME---AGE--BERTH-");
				for(int i=0;i<database.size();i++){
					for(int j=0;j<(database.get(i)).size();j++){
						System.out.print(" "+database.get(i).get(j)+"  ");
					}
					System.out.println();
				}
				usrin=1;
			}
			else if(usrin==4){
				System.out.println("-------AVAILABLE SEATS--------");
				for(int i=0;i<available.length;i++){
					if(available[i]!=0){
						System.out.println(berths[i]+"-"+available[i]);
					}
				}
				usrin=1;
			}
			else if(usrin==0){
				System.out.println("---THANK YOU FOR USING----");
				break;
			}
			// else if(usrin==2){

			// }
			
			// eles if(usrin==4){

			// }
		}
		
	}
}