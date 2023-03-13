package com.oops.practice;

public abstract class VehicleAbstractClass {
         public abstract int getNoOfWheels();
}

class Bus extends VehicleAbstractClass{
	@Override
	public int getNoOfWheels() {
		return 6;
	}
	}

class Auto extends VehicleAbstractClass{
	@Override
	public int getNoOfWheels() {
				return 3;
	}
	}

