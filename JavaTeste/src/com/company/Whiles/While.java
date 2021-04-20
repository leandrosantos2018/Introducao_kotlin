package com.company.Whiles;

public class While {
    public static void main(String[] args) {
        var x = 0;

        while (x < 1){
            System.out.println("dentro while...");
            x++;
        }

        var y = 0 ;

        do {
            System.out.println("dentro do/while");
    } while (y++ < 10);
}
}
