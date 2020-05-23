package javapractice;

public class AnonymousClass {
	private int age=30;
	class InnerClass{
		void a() {
			System.out.println("age =" + age);
		}
	}
		public static void main(String args[]) {
		AnonymousClass ac=new AnonymousClass();
		AnonymousClass.InnerClass ic=ac.new InnerClass();
		ic.a();
	}
	}

