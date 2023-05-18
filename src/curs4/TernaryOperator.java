package curs4;

public class TernaryOperator {
	
	int a
	int b
	int x
	
	System.out.println(x);
	
	int num1=5;
	int num2=10;
	int num3=8;
	int y=(num1?num2)? num1 : num2 ;
	y= (num1>num2)?num1:(num2<num3?num2 :num3);
			if (num1>num2) {
				y=num1;
			}
			else if (num2<num3) {
				y=num2;
			}
			else {
				y=num3;
			}

}
