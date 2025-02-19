package assessments;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.println("Enter Fruit name :");
			a.add(sc.nextLine());
		}
		for(int i=0;i<2;i++) {
			System.out.println("Enter city name :");
			a.add(sc.nextLine());
		}
		for(int i=0;i<2;i++) {
			System.out.println("Enter hobbies :");
			a.add(sc.nextLine());
		}
		System.out.println(a);
		a.remove("Sleep");
	   System.out.println(a.contains("cricket"));
	   a.remove("hyd");
	   a.remove("grapes");
	   a.reversed();
	   a.set(4, "Kerala");
	   a.set(2, "Mango");
	   int pos=a.indexOf(("Singing"));
	   a.set(pos,"dancing");
	   System.out.println(a.subList(1, 5));
	   System.out.println(a);
	   
		
		
		
		

	}

}
