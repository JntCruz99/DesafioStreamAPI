package Desafio11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int somaDosQuadrados = numeros.stream()
                .mapToInt(num -> num * num)
                .sum();

        System.out.println("A soma dos quadrados de todos os números é: " + somaDosQuadrados);
    }
}
