package Desafio5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble mediaDosMaioresQue5 = numeros.stream()
                .distinct()
                .filter(num -> num > 5)
                .mapToInt(Integer::intValue)
                .average();

        if (mediaDosMaioresQue5.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + mediaDosMaioresQue5.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista.");
        }
    }
}

