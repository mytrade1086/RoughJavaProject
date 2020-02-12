
public class primeDemo {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 3; i <= 30; i++) {
			counter = 0;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					counter++;
					break;
				}
			}

			if (counter > 0) {
				System.out.println("not prime" + i);
			} else {
				System.out.println(" prime" + i);
			}
		}
		
	System.out.println("###################Separator###########################");	
		int counter2 = 0;
		for (int i = 3; i <= 30; i++) {
			counter2 = 0;
			
			for (int j = 2; j<=i;j++) {
				if (i % j == 0) {
					counter2++;
					//break;
				}
			}

			if (counter2 > 1) {
				System.out.println("not prime" + i);
			} else {
				System.out.println(" prime" + i);
			}

		}
		
		
		
		
		
		
		
		
		
	}
}
