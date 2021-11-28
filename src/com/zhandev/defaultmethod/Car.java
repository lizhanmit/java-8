package com.zhandev.defaultmethod;

public class Car implements FourWheeler, Vehicle {

	public void print() {
		Vehicle.super.print();
		Vehicle.blowHorn();
		FourWheeler.super.print();
		System.out.println("I am a car");
	}
}
