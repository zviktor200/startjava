public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if(age > 20) {
			System.out.println("yes");	
		}

		boolean isMale = true;
		if(isMale){
			System.out.println("yes");
		}
		if(!isMale){
			System.out.println("no");
		}
		
		int height = 179;
		if(height < 180){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		char firstLetterOfName = 'I';
		if(firstLetterOfName == 'M') {
        	System.out.println("yes");
		} else if(firstLetterOfName == 'I') {
    		System.out.println("no");
		} else {
    		System.out.println("UPS"); 
    	}
	}
}
