package Desafio10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Map<Integer, List<Integer>> grupos = numeros.stream()
                .filter(num -> num % 2 != 0 && (num % 3 == 0 || num % 5 == 0)) // Seleciona ímpares múltiplos de 3 ou 5
                .collect(Collectors.groupingBy(num -> num % 3 == 0 ? 3 : 5)); // Agrupa por 3 ou 5

        System.out.println("Valores ímpares múltiplos de 3 ou 5 agrupados por chave:");
        grupos.forEach((chave, valores) -> {
            System.out.println("Chave " + chave + ": " + valores);
        });
    }
}
