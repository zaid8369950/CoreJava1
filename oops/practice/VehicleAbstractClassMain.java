package com.oops.practice;

public class VehicleAbstractClassMain {

	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
		
		Auto a = new Auto();
		System.out.println(a.getNoOfWheels());
	}
}
