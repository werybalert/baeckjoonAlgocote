import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m = 0  ;
        h = sc.nextInt();
        m = sc.nextInt();
        
	   sc.close();      
 	
	if(m <45 ) {
		h -= 1;
		m = 60 - (45 - m);	
		if (h<0){
				h = 23;
			   }
		System.out.println(h + " " + m);
		}
	else {
		System.out.println(h+ " " + (m-45));
		} 

	}
}