
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] ch={'a','r','u','n'};
	
		
		System.out.println(ch);
		
		
		//By using String literal
		String name="arunkumarvajinepely";
		
		//By using new keyword
		String country=new String("arun");
		String state="Telgana:is: my:state       ";
		System.out.println(name.charAt(2));
		
		System.out.println(name.length());
		
		System.out.println(name.concat(country));
		
		System.out.println(name.contentEquals(country));
		
		System.out.println(name.contains("arun"));
		
		System.out.println(name.compareTo(country));
		
		System.out.println(name.equals(country));
		
		System.out.println(name.trim());
		
		    String[] str=state.split(":");
		    
		    for(int i=0;i<str.length;i++){
		    	System.out.println(str[i]);
		    }
		    
		int a=10;
		System.out.println(String.valueOf(a));
	
		String value ="10";
		System.out.println(Integer.parseInt(value));
		
		StringBuffer sb=new StringBuffer("aru");
	}

}
