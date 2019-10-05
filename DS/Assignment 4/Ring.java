//Source: https://pocketstudyblog.wordpress.com/2019/04/14/ring-algorithm-in-java/

import java.util.Scanner;

class Process {
	public int tid;
	public boolean active;
	
	public process(int id) {
		this.id = id;
		active = true;
	}
}

public class Ring {
	int no_of_processes;
	Process[] processes;
	Scanner sc = new Scanner(System.in);
	public void initializeRing() {
		System.out.println("Enter number of processes");
		no_of_processes = sc.nextInt();
		processes = new Process[no_of_processes];
		
		for(int i = 0; i < processes.length; i++) {
			processes[i] = new Process(i);			
		}
	}
	
	public int getMax() {
		int maxid = -99;
		int maxidindex = 0;
		for(int i = 0; i < processes.length; i++) {
			if (processes[i].active && processes[i].id > maxId) {
				maxid = processes[i].id;
				maxidindex = i;
			}
		}
		return maxidindex;
	}
	
	public void performElection() {
		System.out.println("Process number: " + processes[getMax()].id + "fails");
		processes[getMax()].active = false;
		System.out.println("Election initiated by");
		int initiatorProcess = sc.nextInt();
		
		int prev = initiatorProcess;
		int next = prev + 1;
		
		while(true) {
		if(processes[next].active) {
			System.out.println("Process" + processes[prev].id + " pass Election(" + processes[prev].id + ") to" + processes[next].id);
			prev = next;
		}
		
	}
	
}
