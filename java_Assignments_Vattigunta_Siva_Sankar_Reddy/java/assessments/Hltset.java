package assessments;

import java.util.LinkedHashSet;
import java.util.Scanner;
public class Hltset {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<10;i++) {
			l2.add(sc.nextInt());
			System.out.println("enter next numebr:");
		}
		
		
		l1.add(100);
		l1.add(102);
		l1.add(2.0f);
		l1.add(10.00f);
		l1.add('s');
		l1.add('i');
		l1.add(true);
		
		l1.add("siva");
		l1.add(false);
		l1.remove(102);
		for(int i=0;i<l1.size();i++) {
			if( l1.contains("")) {
				System.out.println("Contains String");
			}
		}
		l1.contains(5);
		l2.contains(5);
		System.out.println(l1);
		System.out.println(l2);
		
		l2.clear();
		l1.clear();
		
		
		
		

	}

}
