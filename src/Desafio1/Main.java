package Desafio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
                .distinct()
                .sorted()
                .toList();

        numerosOrdenados.forEach(System.out::println);


        List<String> alfabeto = Arrays.asList("A","C","Q","B","L","Z","D","F");

        List<String> alfabetoOrdenado = alfabeto.stream()
                .sorted()
                .toList();
        alfabetoOrdenado.forEach(System.out::println);

        List<Integer> numerosOrdenadosDecrescente = numeros.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .toList();

        numerosOrdenadosDecrescente.forEach(System.out::println);

    }
}