package curs7;
/*
 * plecam de la un array de tip int
 * ne trebuie o metoda pt a gasi care este indexul unui element		
 * sper ex:am un array care contine 
 * ex: {2 4 6 8 9 12}
 * index pt element 8 = 3
 * rezolvare cu:
 * for
 * for each
 * while
 * do while
 * 
 */
public class FindIndexOfElement {
	
	static int[] numbers = {3, 5, 7, 8, 9, 2, 12, 1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rezolvareCuFor(8);
		rezolvareCuForEach(8);
		rezolvareCuWhile(8);
		rezolvareCuDoWhile(8);

	}
	
	public static void rezolvareCuFor(int element) {
		for (int i=0; i<numbers.length;i++) {
			if (numbers[i] == 8) {
				System.out.println("Indexul elementului "+element+" este "+i);
			}
		}
		
	}
	/*
	 * Iterator<Integer> index = numbers.iterator();
	 * while(numbers.hasNext()){
	 * ......
	 * }
	 */
	
	public static void rezolvareCuForEach(int element) {
		int i=0;
		for (int nr: numbers) {
			if(nr==element) {
				System.out.println("Indexul elementului "+element+" este "+i);
				break;
			}
			i++;
		}
		
	}
	
	public static void rezolvareCuWhile(int element) {
		int i=0;
		while (i<numbers.length) {
			if (numbers[i] == 8) {
				System.out.println("Indexul elementului "+element+" este "+i);
		}
			i++;
	}

	}
	
	public static void rezolvareCuDoWhile(int element) {
		int i=0;
		do {if(numbers[i]==element) {
			System.out.println("Indexul elementului "+element+" este "+i);
			break;
		}
		i++;
		}while(i<numbers.length);
		
		
	}
	}
