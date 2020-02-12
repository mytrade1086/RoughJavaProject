
public class swapString {

	public static void main(String[] args) {
	
		String a="sumit";
		String b="sagar";
		a=a+b;	
		b=a.replaceAll(b, "");
		a=a.replaceFirst(b, "");
		System.out.println("b is"+b+"   a is:"+a);
	}

}
