
public class missingarray {
	
	public static void main(String[] args) {
		
		
		int []a= {1,2,4,5,6};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			
		}
	
		int ExpectedSum=0;
		for(int j=1;j<=6;j++) {
			
			ExpectedSum=ExpectedSum+j;
			
		}
			
		System.out.println("Missing Number="+(ExpectedSum-sum)); //Missing Number=3	
			
		}

}
