package Desafio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.removeIf(num -> num % 2 != 0);
        List<Integer> list = numeros.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .toList();

        System.out.println("Lista após remover os números ímpares: " + list);
    }
}
