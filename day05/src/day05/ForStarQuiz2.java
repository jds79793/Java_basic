
package day05;

import java.util.Scanner;

public class ForStarQuiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.close();
		
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++){
				if(j <= N-i) {
				System.out.print(" ");
				}
				}
			
			for(int k = 1; k <= i; k++) {
			System.out.print("*");
			}
			
			
			System.out.println();
		
		}	
	
	}

}
