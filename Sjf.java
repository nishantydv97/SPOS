package spos;
import java.util.*;
public class Sjf {
	public static int[] getMinAndIndex(int[] array,int n,int [] rt,int [] flag) {
		int[] min = new int[2];
		min[0]=999;
		min[1]=0;
		int trt=0;
		for(int i=0;i<n;i++) {
			if(array[i]<min[0]) {
				min[0]=array[i];
				min[1]=i;
				trt=rt[i];
			}
			else
				if(array[i]==min[0]) {
					if(rt[i]<trt) {
						min[0]=array[i];
						min[i]=i;
					}
			}
			flag[i]=1;
		}
		return(min);
	}
	public static void flag(int[] flag,int n,int[] at) {
		for(int i=0;i<flag.length;i++) {
			if(at[i]<=n) {
				flag[i]=1;
			}
		}
	}
	public static void main(String ... args) throws Exception{
		Scanner sc= new Scanner(System.in);
		int [] at,bt,wt,rt;
		String [] p;
		int n;
		System.out.println("Enter the no of process");
		n=sc.nextInt();
		at=new int[n];
		bt=new int[n];
		wt=new int[n];
		rt=new int[n];
		int [] flag=new int[n];
		p=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Process ID ");
			p[i]=sc.next();
			System.out.println("Enter the Arrivel time ");
			at[i]=sc.nextInt();
			System.out.println("Enter the Brust time");
			bt[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			rt[i]=bt[i];
		}
		int max=0;
		for(int i=0;i<n;i++) {
			if(at[i]>max) {
				max=at[i];
			}
		}
		int[] minI=getMinAndIndex(at,n,rt,flag);
		for(int i=minI[0];i<=max;i++) {
			rt[minI[1]]-=1;
			
		}
	}
}
