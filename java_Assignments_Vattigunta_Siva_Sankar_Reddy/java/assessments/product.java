package assessments;

public class product {
	String name;
	int id;
      public product() {
    	   name="Amul";
    	   id =78;
      }
      public void display() {
    	  System.out.println("ID :"+this.id);
    	  System.out.println("Name : "+this.name);
      }
	public static void main(String[] args) {
		product p=new product();
		p.display();

	}

}
