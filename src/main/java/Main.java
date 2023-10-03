import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();
        System.out.println("Сумма первого и второго числа: " + (firstNumber+secondNumber));
        System.out.println("Разность первого и второго числа: " + (firstNumber-secondNumber));
        System.out.println("Произведение первого и второго числа: " + (firstNumber*secondNumber));
        System.out.println("Частное первого и второго числа: " + ((double)firstNumber/secondNumber));
    }
}
