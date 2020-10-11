public class Cycle {
	public static void main(String[] args) { 
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int k = -6;
		while(k <= 6) {
			System.out.println(k);
			k += 2;
		}
		System.out.println();
		
		int g = 10;
		do {
			if (g % 2 == 1) {
				System.out.println(g);
			}
			g++;
		} while (g <=20);
	}
}