import java.io.FileInputStream;


class Inheritance{
	 int a=10;
	 void display(){
		System.out.println("i am in parent class");
	}
}

 class TestingClass extends Inheritance {
	 
	 void display(){
		 //super.display();;
		 System.out.println("i am in child class");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingClass t1=new TestingClass();
		t1.a=50;
		t1.display();
	}

}
