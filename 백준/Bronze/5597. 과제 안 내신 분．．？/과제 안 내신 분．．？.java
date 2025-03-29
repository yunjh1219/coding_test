import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
	  int stu[] = new int[30];
	  int sto[] = new int[30];
	  
	  for (int i=0; i<stu.length; i++) {
		  stu[i] = i+1;
	  }
	  
	  for (int i=0; i<28; i++) {
		  int n = sc.nextInt();
		  sto[n-1] = n;
	  }
	  
        
        for( int i=0; i<30; i++) {
        	if(sto[i] != stu[i]) {
        	 
        		System.out.println(stu[i]);
        	}
        }
        sc.close();
	}
}
