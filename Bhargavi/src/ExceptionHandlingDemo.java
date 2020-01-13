import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionHandlingDemo {
	
	int div;
	void division(){
		try{
		div=10/2;	
		System.out.println(div);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		System.out.println("The divison method got executed Successfully");	
		}
	}
	
	void show() throws IOException, InterruptedException{
		System.out.println("I am in show  method");
		try{
		FileInputStream fi=new FileInputStream("ssssss");
		fi.read();
		Thread.sleep(3000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("The try block gt executed");
		}
	}
	
	void age(int age) throws InvalidAgeException,IOException{
		if(age>18){
			System.out.println("User eligible for voting");
		}else{
			throw new InvalidAgeException("Not Eligible for voting");
	
		}
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException, InvalidAgeException {
		// TODO Auto-generated method stub
		
		ExceptionHandlingDemo e1=new ExceptionHandlingDemo();
		
	     e1.age(15);

	}

}
