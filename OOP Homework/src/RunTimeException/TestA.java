package RunTimeException;

public class TestA {
	
	public static void main(String[] args) {
		try{
			int number1 = 1;
			int number2 = 0;
			int result = number1 / number2;
			System.out.println(1 + " / " + 0 + " is " + result);
		}
		catch(ArithmeticException ex){
			System.out.println("Arithmetic Exception " + "cannot be divided by Zero ");
		}
	}

}
