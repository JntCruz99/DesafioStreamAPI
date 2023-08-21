package Desafio6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 5, 4, 3);

        boolean numeroMaiorDez = numeros.stream()
                .anyMatch(num -> num > 10);

        if (numeroMaiorDez){
            System.out.println("Existe um numero maior que 10");
        }else {
            System.out.println("Não existe um numero maior que 10");
        }

    }
}
