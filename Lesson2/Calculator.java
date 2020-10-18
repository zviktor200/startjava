public class Calculator {
		
		int number1;
		int number2;
		char operation;
		int result = 1;
		public void setnumber1(int number1) {
			this.number1 = number1;
		}

		public void setoperation(char operation) {
			this.operation = operation;
		}
		public void setnumber2(int number2) {
			this.number2 = number2;
		}

		public void pow() {
			for (int i = 1; i <= number2; i++) {
				result *= number1;
		}
	}

		public void calculate() {
        switch (operation) {
            case '*':
                System.out.println(number1 * number2);
                break;
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '^':
                pow();
                System.out.println(result);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("ERROR");
        }
	}
}
