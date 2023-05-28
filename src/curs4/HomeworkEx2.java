package curs4;

public class HomeworkEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int comision;
		int vanzari = 3500;
		//comision = (vanzari>2500)?vanzari*5/100:0;
		
		if (vanzari>2500) {
			comision=vanzari*5/100;
		}
		else {
			comision=0;
}
		System.out.println("Comisionul tau este: " + comision);

	}

}
