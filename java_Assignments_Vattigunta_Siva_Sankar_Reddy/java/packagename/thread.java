package packagename;
 
public class thread extends Thread{  

	 public void run(){  

	  for(int i=1;i<5;i++){  

	    try{

	    		Thread.sleep(3000);  

	    	}

	    catch(InterruptedException e)

	    {

	    	System.out.println(e);

	    }  

	    System.out.println(Thread.currentThread().getName()+ "  :"+ i + " >> " + Thread.currentThread().getState());  

	  }  

	   System.out.println(Thread.currentThread().getName()+ "  : >> " + Thread.currentThread().getState());  

	 }  

	 public static void main(String args[]){  

	  thread t1=new thread();  

	  t1.setName("Java");

	  t1.setPriority(MAX_PRIORITY); 

	  thread t2=new thread();  

	  t2.setName("Python");

	  t2.setPriority(NORM_PRIORITY);

	  thread t3=new thread(); 

	  t3.setName("Oracle");

	 thread t4=new thread(); 

	  t4.setName("C++");

	  t4.setPriority(MIN_PRIORITY); 

	  t1.start();  

	  t2.start();  

	  t3.start();

	  t4.start();

	  System.out.println(t1.getState());

	  System.out.println(t3.getState());

	  System.out.println(t2.getState());

	 }  

	}  
 