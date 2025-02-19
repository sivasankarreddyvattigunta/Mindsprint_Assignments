package assessments;

public class Subb extends B {
	int price;
	public Subb(){
		price=10;
	}
	public void display() {
		System.out.println(this.count*this.price);
		System.out.println(this.id);
		 System.out.println("Name : "+this.name);
		 System.out.println("category : "+this.category);

		
	}
	
	

	public static void main(String[] args) {
		Subb a=new Subb();
		a.display();

	}

}
