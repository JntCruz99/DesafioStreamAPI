package Desafio12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        int limiteInferior = 30;
        int limiteSuperior = 70;

        List<Integer> numerosFiltrados = numeros.stream()
                .filter(num -> num >= limiteInferior && num <= limiteSuperior)
                .toList();

        System.out.println("Números dentro do intervalo [" + limiteInferior + ", " + limiteSuperior + "]: " + numerosFiltrados);
    }
}
