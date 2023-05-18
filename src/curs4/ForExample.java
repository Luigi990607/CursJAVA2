package curs4;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for (int i=0; i<10; i++) {
    	   if (i==5) {
    		   //break;//intrerupe executia buclei
    		   continue;//face skip
    	   }
    	   System.out.println(i);
       }
	}

}
