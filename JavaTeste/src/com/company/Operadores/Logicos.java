package com.company;

public class Logicos {
    public static void main(String[] args) {
        final var numero = 2;
        final var letra = "A";
        //Sort Circuit
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a Condicao");
        }
        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outra condição");
        }
        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Lógica maluca...");
        }
        // Non Sort Circuit
//
//    if(Verifica(15) | Verifica("A")){
//        System.out.println("OK");
//    } else {
//        System.out.println("Não OK");
//    }
//    private static boolean Verifica(String letra){
//            System.out.println("vericiando letra");
//            return letra.equals("A");
//        }
//
//    private static boolean Verifica(Integer numero){
//            System.out.println("Verificando numero...");
//            return numero > 10;
//        }
}
}

