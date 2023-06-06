package curs5;

public class HomeworkEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0;
		int f2=1;
		int f=0;
        int x=9;
        System.out.print("Seria Fibonacci pentru "+x +" numere: ");
        System.out.print(f1 +" " +f2+" ");
        for (int i=2;i<x;i++) {
        	f=f1+f2;
        	f1=f2;
        	f2=f;
        	System.out.print(f+" ");
        }
        f1=0;
        f2=1;
        f=0;
        x=9;
        System.out.println();
        System.out.print("Seria Fibonacci pentru "+x +" numere: ");
        System.out.print(f1 +" " +f2+" ");
        int j=2;
        while(j<x) {
        	f=f1+f2;
        	f1=f2;
        	f2=f;
        	j++;
        	System.out.print(f+" ");
        	
        }
	}

}
