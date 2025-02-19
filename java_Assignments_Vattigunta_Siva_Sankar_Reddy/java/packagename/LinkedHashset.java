package packagename;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashset {

	public static void main(String[] args) {
		HashSet<String> n=new HashSet();
		String s="siva";
		n.add(s);
		TreeSet t=new TreeSet();
		TreeSet t1=new TreeSet();
	
		n.add("r");
		n.add("a");
		n.add("s");
		n.add("p");
		LinkedHashSet<String> e=new LinkedHashSet<String>();
		e.add("india");
		System.out.println(e.contains("england"));
		e.addAll(n);
		t.addAll(e);
		t1.add(100);
		System.out.println(e);
		System.out.println(t);
		
		
	}

}
