package javapractice;

public abstract class AutoMobile {
	static int registrationNum;
	int modelNum;
	String vehicleType;
	AutoMobile(){
		System.out.println("This automobile default constructor");
	}
	AutoMobile(int modelNum,String vehicleType){
		this.modelNum=modelNum;
		this.vehicleType=vehicleType;
		System.out.println("This automobile parameter constructor");
	}
	
	abstract void start();
	abstract void run();
	abstract void stop();
	static void direction() {
		System.out.println("Automobile direction");
	}
	final int doorOpen() {
		System.out.println("AutoMobile door opened");
		return 0;
	}
	
}
