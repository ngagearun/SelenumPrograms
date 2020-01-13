import java.io.IOException;
import java.util.Scanner;


 class ArrayDemo implements InterfaceDemo {
	
	@Override
	public  void add() {
		// TODO Auto-generated method stub
		
		System.out.println("i am in add method");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am in display method");
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int  []d=new int[2];
		int c[][] =new int[2][];
		int b[]={10,20,30};
		for(int i=0;i<b.length;i++)
		System.out.println(b[i]);		
		System.out.println("Execution of programm is completed");
		int ava=System.in.read();
		System.out.println(ava);
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
	}

	
}
