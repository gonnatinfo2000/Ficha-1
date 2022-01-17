public class Main {

	public int multiplicacao (int num1, int num2) {
		return num1*num2;
	}
	public int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtracao(int num1, int num2) {
		return num1 - num2;
	}
	
	
	public int operaçãoComplexa(int num1,int num2) {
		return soma(num1, num2)*subtracao(num1,num2);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!"); // Display the string;
	}
	
}
