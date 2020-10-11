public class MyFirstGame {
    public static void main(String[] args) {
        int number = 24;
        int random = 99;
        while (number != random) {
            if (number < random) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер " + number + " " + random);
                number++;
            } else if (random < number) {
                System.out.println("Введенное вами число больше того, что загадал компьютер " + number + " " + random);
                number--;
            }
        }
        System.out.println("Вы угадали!" + number);
    }
}