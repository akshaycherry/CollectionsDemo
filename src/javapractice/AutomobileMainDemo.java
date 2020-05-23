package javapractice;

public class AutomobileMainDemo {

	public static void main(String[] args) {
		AutoMobile autoMobile=null;
		autoMobile=new FourWheeler();
		/*autoMobile=new FourWheeler(2345675,"luxury car");
		FourWheeler fourWheeler=new FourWheeler();
		autoMobile.start();
		autoMobile.run();
		autoMobile.stop();
		autoMobile.direction();
		int modelNum=autoMobile.modelNum;
		String vehicleType=autoMobile.vehicleType;
		System.out.println(modelNum);
		System.out.println(vehicleType);
		
		int num=fourWheeler.registrationNum;
		fourWheeler.direction();*/
		AutoMobile.direction();
		autoMobile.doorOpen();
	}
}
