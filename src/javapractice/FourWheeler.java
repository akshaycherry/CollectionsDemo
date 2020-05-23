package javapractice;

public class FourWheeler extends AutoMobile {
	int modelNum;
	String type;
	FourWheeler(){
		System.out.println("This is FourWheeler default constructor");
	}
	FourWheeler(int modelNum,String type){
		super(678945,"Truck");
		this.modelNum=modelNum;
		this.type=type;
		System.out.println("This is FourWheeler parameter constructor");
	}
	void start() {
		super.direction();
		System.out.println("Engine started");
	}
	void run() {
		System.out.println("Engine runs");
	}
	void stop() {
		System.out.println("Engine stops");
	}
	/*void direction() {
		System.out.println("FourWheeler direction");
	}*/
	/*int doorOpen() {
		super.doorOpen();
		System.out.println("FourWheeler door is opened");
		return 0;
	}*/
}
