package assessments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			l.add(sc.nextLine());
		}
		l.add("December");
		l.addFirst("January");
		l.add(1,"Feb");
		l.add(2, "March");
		l.add(8,"Sept");
		l.add(9,"oct");
		System.out.println(l);
		Iterator it=l.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		for (int i=0;i<l.size();i+=2) {
			l.get(i);
		}
		for(int i=1;i<l.size();i+=2) {
			l.get(i);
		}
		System.out.println(l.get(0)+" "+l.get(l.size()-1));
		System.out.println(l.remove("January"));
		if (l.contains("January") || l.contains("February") || l.contains("December")){
			System.out.println("contains winter month");
		}
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l);
	}

}
