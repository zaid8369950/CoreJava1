package com.flow.control;

public class EnhancedForLoop3D {

	public static void main(String[] args) {
		int[] [] [] x = {{{1, -2, 3},{2, 3, 4}},{{-4, -5, 6, 9},{1},{2, 3}}};
		for(int [] [] x1:x) {
			for(int [] x2:x1) {
				for(int x3:x2) {
					System.out.println(x3);
				}
			}
		}

	}

}
