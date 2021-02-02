package cyberchlng;

import java.util.*;

public class evolution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int K = scanner.nextInt();

		scanner.nextLine(); // Move scanner to the next line

		char G[][] = new char[N][M];
		char x[][] = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String line = scanner.nextLine();
			for (int j = 0; j < M; j++) {
				G[i][j] = line.charAt(j);
			}
		}
		int c = 0;
		
		// WRITE YOUR SOLUTION HERE
		for (int round = 0; round < K; round++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) { 
					c = 0;
					try {
						if (G[i - 1][j] != '.')
							c++;
					} catch (Exception e) {
					}
					try {
						if (G[i - 1][j + 1] != '.')
							c++;
					} catch (Exception e) {
					}
					try {
						if (G[i][j + 1] != '.')
							c++;
					} catch (Exception e) {
					}
					try {
						if (G[i + 1][j + 1] != '.')
							c++;
					} catch (Exception e) {
					}
					try {
						if (G[i + 1][j] != '.')
							c++;
					} catch (Exception e) {
					}
					try {
						if (G[i + 1][j - 1] != '.')
							c++;
					} catch (Exception e) {
					}
					try {
						if (G[i][j - 1] != '.')
							c++;
					} catch (Exception e) {
					}
					try {
						if (G[i - 1][j - 1] != '.')
							c++;
					} catch (Exception e) {
					}

					if (c < 4)
						switch (G[i][j]) {
						case '.':
							x[i][j] = '.';
							break;
						case '+':
							x[i][j] = '.';
							break;
						case '*':
							x[i][j] = '.';
							break;
						default:
							break;
						}
					else if (c > 4) {
						switch (G[i][j]) {
						case '.':
							x[i][j] = '+';
							break;
						case '+':
							x[i][j] = '*';
							break;
						case '*':
							x[i][j] = '+';
							break;
						default:
							break;
						}
					}else
						x[i][j]=G[i][j];
				}

			}
			for(int i=0; i<x.length; i++)
				  for(int j=0; j<x[i].length; j++)
				    G[i][j]=x[i][j];
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(G[i][j]);
			}
			System.out.println();
		}
	}
}
    
