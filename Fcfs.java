package spos;
import java.util.Scanner;
public class Fcfs {
	public static void main(String ... args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String [] p;
		int [] at,bt,ct,tat,wt;
		int n;
		System.out.println("enter the no of process");
		n=sc.nextInt();
		p=new String[n];
		at=new int[n];
		bt=new int[n];
		ct = new int[n+1];
		tat = new int[n];
		wt = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the process name");
			p[i]=sc.next();
			System.out.println("enter the arival time of process");
			at[i]=sc.nextInt();
			System.out.println("enter the burst time of process");
			bt[i]=sc.nextInt();
			ct[i]+=bt[i];
			ct[i+1]=ct[i];//doubt
			tat[i]=ct[i]-at[i];
			wt[i]=tat[i]-bt[i];
			System.out.println(ct[i]);
			System.out.println(tat[i]);
			System.out.println(wt[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.println("complition time of process "+p[i]+" is :-  "+ct[i]);
			System.out.println("turn around time of process "+p[i]+" is :-  "+ct[i]);
			System.out.println("waiting time of process "+p[i]+" is :-  "+wt[i]);
			System.out.println();
		}
		int avg=0;
		for(int i=0;i<n;){
			avg+=wt[i];
		}
		System.out.println("Average time of the process is "+avg);	
	}
}
