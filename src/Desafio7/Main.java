package Desafio7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenadosDecrescente = numeros.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .toList();

        if (numerosOrdenadosDecrescente.size() >= 2) {
            int segundoMaior = numerosOrdenadosDecrescente.get(1);
            System.out.println("O segundo número maior da lista é: " + segundoMaior);
        } else {
            System.out.println("A lista não contém pelo menos dois números distintos.");
        }
    }
}
