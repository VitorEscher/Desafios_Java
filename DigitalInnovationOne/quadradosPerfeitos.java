import java.util.*;

public class quadradosPerfeitos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        int n = Integer.parseInt(entrada);
        int soma = 0;

        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> resultados = new ArrayList<>();

        for(int i=1; i< n; i++){
            double quadrado = Math.pow(i, 2);
            if(i == Math.sqrt(quadrado)){
              if(quadrado < n){
                arr.add((int) quadrado);
              }
            }
          }
          
          for(int i=arr.size()-1; i >= 0 ; i--){
            if(arr.get(i)* arr.size() == n){
              resultados.add(arr.get(i));
            } else if(arr.get(i) + soma <= n){
              soma += arr.get(i);
              resultados.add(arr.get(i));
            }
          }

          System.out.println(resultados.size());
        
        }
}
