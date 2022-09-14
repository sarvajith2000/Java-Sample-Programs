package samplePg;
class Car {
	public void switchGear()
	{
		System.out.println("inside switch gear");
	}
	public void accelerate()
	{
		System.out.println("inside accelerateCar");
		updateSpeedoMeter();
		injectFuel();
	}
	public void applyBreak()
	{
		System.out.println("inside applyBreak");
		updateSpeedoMeter();
		injectFuel();
	}
	private void injectFuel()
	{
		System.out.println("inside injectFuel ");
	}
	private void updateSpeedoMeter()
	{
		System.out.println("inside updateSpeedoMeter");
	}
}
public class TestAbstraction{
	public static void main(String args[])
	{
		Car mycar = new Car();
		mycar.accelerate();
		mycar.applyBreak();
		mycar.switchGear();
		
	}
}