package Desafio8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(123, 456, 789);

        int somaDosDigitos = numeros.stream()
                .mapToInt(Main::sumDigits)
                .sum();

        System.out.println("A soma dos dígitos de todos os números é: " + somaDosDigitos);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
