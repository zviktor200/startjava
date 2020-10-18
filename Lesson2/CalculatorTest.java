import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args){
	Calculator calc = new Calculator();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Введите первое число: ");
	int number1 = scan.nextInt();
	calc.setnumber1(number1);

	System.out.println("Введите операцию: ");
	String text = scan.next();
	char operation = text.charAt(0);
	calc.setoperation(operation);

	System.out.println("Введите второе число: ");
	int number2 = scan.nextInt();
	calc.setnumber2(number2);

	calc.calculate();

}
}
