package DigitalInnovationOne;

import java.util.Scanner;

public class palindromoComStringBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        var builder = new StringBuilder(palavra);

        var palavraInvertida = builder.reverse().toString();

        if(palavra.toLowerCase().equals(palavraInvertida.toLowerCase())){
            System.out.println("TRUE");
            System.out.println(palavra);
            System.out.println(palavraInvertida);
        } else {
            System.out.println("FALSE");
            System.out.println(palavra);
            System.out.println(palavraInvertida);
        }
    }
}