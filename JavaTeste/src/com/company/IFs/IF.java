package com.company;

public class IF {

    public static void main(String[] args) {
        final var condicao = false;
        if(condicao){
            System.out.println("A CONDIÇÃO É VERDADEIRA");
        } else  {
            System.out.println( "A CONDIÇÃO É falsa");
        }
        if(condicao){
            System.out.println("uma unida linha...");

            final var ternario =  condicao ? "é verdadeira" : "é falsa";
            System.out.println(ternario);
        }
    }
}
