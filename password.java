package cyberchlng;

import java.util.*;

public class password {
    public static void solve(Scanner scanner) {
        boolean correct = false;

        String P = scanner.nextLine();
        String H = scanner.nextLine();
        
        char[] pw = P.toCharArray();
        Arrays.sort(pw);
        char[] hs = H.toCharArray();
        
        char[] check = new char[pw.length];
        int i=0;
        for(int l = 0; l<H.length()-P.length()+1;l++) {
	        for (i=l; i < check.length + l; i++) {
				check[i-l]=hs[i];
			}
	        if (checkPerm(check,pw)) {
	        	correct = true;
	        	break;
	        }
        }
        
        
        
        System.out.println( correct ? "1" : "0");
    }
    
    public static boolean checkPerm(char[] x, char[] pw)
    {
        Arrays.sort(x);
        for (int i = 0; i < x.length;  i++)
           if (x[i] != pw[i])
             return false;
     
        return true;
    }
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        scanner.nextLine(); // Move scanner to the next line

        for(int i=0; i<T; i++) {
            solve(scanner);
        }
    }
}
