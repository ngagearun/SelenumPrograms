
public class ConstructorDemo {
	
	float f=11.6f;
	int c=100;
	 ConstructorDemo(){
		int b=40;
		System.out.println(b);
		//return b;
	}
	 
	 ConstructorDemo(int c){
		 this();
		 c=c;
			System.out.println(c);
			//return b;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c1=new ConstructorDemo(60);

	}

}
