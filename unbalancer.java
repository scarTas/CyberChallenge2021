package cyberchlng;

import java.util.Arrays;
import java.util.Scanner;

public class unbalancer {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        scanner.nextLine(); // Move scanner to the next line

        int V[] = new int[N];

        for(int i=0; i<N; i++) {
            V[i] = scanner.nextInt();
        }

        int solution = 0;
        
        //solution
        Arrays.sort(V);
        //solution = V[N-1];
        
        for (int i = 0; i <= K; i++) {
        	solution += V[N-i-1];	
		}
        
        System.out.println(solution);
    }
}
