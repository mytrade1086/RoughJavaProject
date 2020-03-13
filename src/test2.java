import java.util.ArrayList;
import java.util.TreeSet;

public class test2 {
	
	static int num=4;
	static int  count=0;

	public static void main(String[] args) {
		
		
		boolean flag=false;
		int[] b = { 1, 2, 3, 4, 4, 5, 4 };
		
	
		for(int i=0;i<b.length;i++) {
				for(int j=0;j<b.length;j++) {		
				if (b[j]==num && flag==false) {		
					count++;
					
					System.out.println("first occur: "+j);
					flag=true;
					break;
				}
				
				
				}			
			}
		
		
		
		System.out.println("total count "+count);
		}

}
