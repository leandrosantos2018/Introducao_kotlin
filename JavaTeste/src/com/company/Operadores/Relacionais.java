package com.company.Operadores;

public class Relacionais  {
    public static void main(String[] args) {
        final var numero = 10;

        if(numero > 20){
            System.out.println("o numero é maior que 20");
                    }else if(numero >= 10){
            System.out.println("o numero é maior ou igual a 10");
        }else if(numero <= 5){
            System.out.println("o numero é menor ou igual que 5");
        }else {
            System.out.println("nenhum da anteriores");
        }


        int i;
        for(i= 0; (i < 20); i++){
            System.out.println("contando numero" + i);
        }
            System.out.println("Fim DO Programa");
    }

}
