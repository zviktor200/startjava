public class Variable {
	public static void main(String[] args) {
		char cpu = '3';
		byte ram = 4;
		int hdd = 500;
		float frequency = 2.30f;
		double core = 2;
		short typeSystem = 64;
		long versionWin = 10;
		boolean laptop = true;

		System.out.println("Процессор i:" + cpu);
		System.out.println("ОЗУ:" + ram + "гб");
		System.out.println("Частота:" + frequency + "Gz");
		System.out.println("Кол-во ядер:" + core);
		System.out.println("Жесткий:" + hdd + "гб");
		System.out.println("Тип системы" + typeSystem);
		System.out.println("Версия Windows-" + versionWin);
		System.out.println("Laptop" + laptop);
	}
}