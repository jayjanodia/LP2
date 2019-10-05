//Source: https://ankurm.com/demonstrating-bully-algorithm-in-java/

import java.io.*;
import java.util.Scanner;

class Bully {
	static int n;
	static int priority[] = new int[100];
	static int status[] = new int[100];
	static int co;
	
	public static void main(String args[]) throws IOException{
		System.out.println("Enter the number of processes");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("For process "+ (i+1)+ ":");
			System.out.println("Status: ");
			status[i] = sc.nextInt();
			System.out.println("Priority: ");
			priority[i] = sc.nextInt();
		}
		
		System.out.println("Which process will initiate election?");
		int element = sc.nextInt();
		elect(element);
		System.out.println("Final coordinator is "+ co);
	}
	
	static void elect(int element) {
		element = element - 1;
		co = element + 1;
		for(int i = 0; i < n; i++) {
			if(priority[element] < priority[i]) {
				System.out.println("Election message is sent from " + (element+1) + " to " + (i + 1));
				if(status[i] == 1)
					elect(i + 1);
			}
		}
	}
}
