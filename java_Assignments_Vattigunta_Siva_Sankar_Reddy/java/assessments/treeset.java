package assessments;
import java.util.Scanner;
import java.util.TreeSet;
public class treeset {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet();
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<6;i++) {
			t.add(sc.nextLine());
		}
		System.out.println(t);
		for (int i=0;i<2;i++) {
			String s=sc.nextLine();
			t.remove(s);
			}
		System.out.println(t);
		
		if (t.contains("java")) {
			System.out.println("contains java");
		}
	}
}
