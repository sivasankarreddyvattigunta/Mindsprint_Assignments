package assessments;
import java.util.LinkedHashMap;
public class linkedmap {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();
		l.put(1, "India");
		l.put(2, "Aus");
		l.put(3,"US");
		l.put(4,"eng");
		l.put(5, "spain");
		l.put(6, "srilanka");
		l.put(7, "bhutan");
		l.put(8, "japan");
		l.put(9, "china");
		l.put(10, "argentina");
		System.out.println(l.keySet());
		System.out.println(l.sequencedValues());
		if (l.containsValue("India")) {
			System.out.println("contains India");
		}
		System.out.println(l.containsKey(45));
		l.remove("japan");
		LinkedHashMap<Integer,String> l1=new LinkedHashMap<Integer,String>();
		l1.put(11,"Tel");
		l1.put(12, "AP");
		l1.put(13,"Tamilnadu");
		l1.put(14, "Punjab");
		l.putAll(l1);
		l.remove(5);
		System.out.println(l.isEmpty());
		System.out.println(l);
		l.clear();
		System.out.println(l.isEmpty());
	}
}
