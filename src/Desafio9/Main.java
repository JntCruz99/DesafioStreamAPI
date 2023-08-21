package Desafio9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoTodosDistintos = numeros.stream()
                .distinct() // Remove duplicatas
                .count() == numeros.size();

        if (saoTodosDistintos) {
            System.out.println("Todos os números da lista são distintos.");
        } else {
            System.out.println("A lista contém números repetidos.");
        }
    }
}

