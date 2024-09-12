package org.abstact;

public class Magan extends appa {

	@Override
	public void car() {
		System.out.println("appa not buy tha car");
	}
	@Override
	public void bike() {
		System.out.println("appa not buy the car");
	}
	
	public void Airplane() {
		System.out.println("magan not buy the plane");
	}
	
public static void main(String[] args) {
	Magan s=new Magan();
	s.bike();
	s.car();
	s.cycle();
	 s.Airplane();
}
}
