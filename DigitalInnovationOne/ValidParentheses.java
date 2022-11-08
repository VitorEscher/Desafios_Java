import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        int letra1 = s.codePointAt(0);
        int letra2 = s.codePointAt(1);
        System.out.println(letra1);
        System.out.println(letra2);
        if(letra1 + 1 == letra2 || letra1 + 2 == letra2 ){
            return true;
        } else {
            return false;
        }
        
    }

}