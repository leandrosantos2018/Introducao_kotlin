package com.company.Exercicios;

import java.util.stream.IntStream;

public class ExericiosExemplo {

    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5).forEach(n ->{
            System.out.println(n);
        });

        IntStream.range(0,10).forEach(n ->{
            System.out.println("numero = " +n);});

    }
}
