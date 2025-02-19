package assessments;

public class C extends product  {
     String category ;
     int count;
     public C(){
    	 category="choco";
    	 count=56;
     }
     public void display() {
    	  System.out.println("ID :"+this.id);
    	  System.out.println("Name : "+this.name);
    	  System.out.println("Category : "+this.category);
    	  System.out.println("Count : "+this.count);
     }
	public static void main(String[] args) {
		C a=new C();
		a.display();
	}
}
