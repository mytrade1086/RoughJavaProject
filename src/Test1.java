
 class Test {
	    public void Print() {
	        System.out.println("Horse");
	    }
	}


	class RaceHorse extends Test1 {
	    public void Print() {
	        System.out.println("RaceHorse");
	    }
	}
	
	
	

	public class Test1 {
	    public static void DoPrint( Test h ) {
	        h.Print();
	    }

	    public static void main(String[] args) {
	        Test1 x = new Test1();
		Test1 y = new RaceHorse();
		RaceHorse z = new RaceHorse();
		DoPrint(x);
		DoPrint(y);
		DoPrint(z);
	    }
	}