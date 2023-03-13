package com.flow.control;

public class InsideLabeledBlockSwitch {

	public static void main(String[] args) {
		int x=10;
		l1:{
			System.out.println("begin");
			if(x==10)
				break l1;
			System.out.println("end");
		}
            System.out.println("Hello");
	}

}
