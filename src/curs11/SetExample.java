package curs11;

import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<>();
		System.out.println("------------");
		
		set.remove("galben");
		System.out.println(set.size());
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
