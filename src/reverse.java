
public class reverse {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		int num=1230;
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;		
		}
		
		
		System.out.println(rev);
	}

}
