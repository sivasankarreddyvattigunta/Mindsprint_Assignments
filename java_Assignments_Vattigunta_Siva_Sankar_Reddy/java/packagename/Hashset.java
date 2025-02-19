package packagename;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		HashSet<String> n=new HashSet();
		String s="siva";
		n.add(s);
	
		n.add("r");
		n.add("a");
		n.add("s");
		n.add("p");
		System.out.println(n);
		hs.add(100);
		hs.add(true);
		hs.add("hash");
		System.out.println(hs);
		System.out.println(hs.contains(101));
		System.out.println(hs.remove(100));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
	}

}
