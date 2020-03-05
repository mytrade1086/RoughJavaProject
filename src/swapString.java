
public class swapString {

	public static void main(String[] args) {
	
		String a="sumit";
		String b="sagar";
		a=a+b;	
		b=a.replaceAll(b, "");
		a=a.replaceFirst(b, "");
		System.out.println("b is "+b+"   a is: "+a);
		
		
		
//		
//		System.out.println("Below uses StringBuffer");
//		
//		StringBuffer sb1=new StringBuffer("sumit");
//		StringBuffer sb2=new StringBuffer("sagar");
//		
//		sb1=sb1.append(sb2);
//		
//		System.out.println("sb1 is "+sb1);
//		
//		sb2=sb1.replace(sb1.indexOf("sagar"), sb1.length(), "");  // sumitsagar sagar
		
	}

}
