package method;
//7번 : 메소드오버로딩 2
public class MethodOverloading02 {
	public static void main(String[] args) {
		MethodOverloading02 m = new MethodOverloading02();
		System.out.println(m.add(10,20));
		System.out.println(m.add(1,2,3));
		m.add(10.5, 3);
		m.add(3.3, 4);
	}
	

	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	int add(int num1, int num2,int num3) {
		return num1 + num2+num3;
	}
	void add(double num1, int num2) {
		System.out.println(num1+num2);
	}
	void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	
}
