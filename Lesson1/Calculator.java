public class Calculator {
	public static void main(String[] args) {
		int number1 = 4;
		int number2 = 3;
		char operation = '^';
		
		if (operation == '*') {
			System.out.println(number1 * number2);
		} else if (operation == '+') {
			System.out.println(number1 + number2);
		} else if (operation == '-') {
			System.out.println(number1 - number2);
		} else if (operation == '^') {
			int result = 1;
			for (int i = 1; i <= number2; i++) {
				result *= number1;
			}
			System.out.println (result);
		} else if (operation == '/') {
			System.out.println(number1 / number2);
		}	else if (operation == '%') {
			System.out.println(number1 % number2);	
		} else {
			System.out.println("ERROR");	
		}
	}
}