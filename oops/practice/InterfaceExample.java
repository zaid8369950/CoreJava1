package com.oops.practice;

interface WaterBottleInteface{
	
	String Colour = "Blue";
	
	void fillUp();
}



public class InterfaceExample implements WaterBottleInteface  {

	public static void main(String[] args) {
		System.out.println(Colour);

		InterfaceExample xz = new InterfaceExample();
		xz.fillUp();
	}

	@Override
	public void fillUp() {
		System.out.println("It is FIlled");
		
	}

}
