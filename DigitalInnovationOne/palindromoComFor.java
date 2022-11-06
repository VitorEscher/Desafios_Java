package DigitalInnovationOne;

import java.util.Scanner;

public class palindromoComFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String palavraInvertida = "";

        for(int i = palavra.length()-1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }

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
