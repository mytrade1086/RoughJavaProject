
public class Childstaticmethod {

	public static void main(String[] args) {
		
		
		Parentstaticmethod p=new Parentstaticmethod();
		Childstaticmethod c=new Childstaticmethod();
		
		p.demo();
		
		c.demo();
		
		//Parentstaticmethod p1=new Childstaticmethod(); ging CE strangely

}

	public static void demo() {
		
		System.out.println("from child");
	}
}