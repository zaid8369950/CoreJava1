package com.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(25);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

    class MyComparator implements Comparator{

		@Override
		public int compare(Object obj1, Object obj2) {
			Integer I1 = (Integer)obj1;
			Integer I2 = (Integer)obj2;
			if(I1 < I2)
				return +1;
			else if(I1 > I2)
				return -1;
			else
			return 0;
			//return I1.compareTo(I2);//ascending 
			//return -I1.compareTo(I2);//desending
			//return I2.compareTo(I1);//decending
		//	return -I2.compareTo(I1);//ascending
			//return +1;
			//return -1;insertion order reverse
		}

		
    	
    }
