package com.flow.control;

public class InsideSwitchBreak {

	public static void main(String[] args) {
		int x=0;
		switch(x) {
		case 0:
			System.out.println(0);
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			default:
				System.out.println("def");
		}

	}

}
