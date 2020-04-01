import java.util.Arrays;

import com.ResurrectionMavenDemoGrp.com.ResurrectionMabenDemoAF.January;

public class Test {

	public static void main(String[] args) {

		int a[] = {  1,2, 3, 2, 3, 14, 2, 3, 4, 5, 6 ,6,-1,-1};
		
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			
			for(int j=i+1;j<a.length;j++) {
				
				//System.out.println(a[i]  +"  "+a[j]);
				
				if(a[i]==a[j]) {		
					count++;
				}
				
				
			}
			
			if(count>0) {
			System.out.println(a[i] +"appears "+count+" times");
				
				
			}
		}
		
		
		
	
		
	
}}
