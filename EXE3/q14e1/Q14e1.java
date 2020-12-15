package q14e1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Q14e1 {

    public static void main(String[] args) {
      Set<Double> d = new HashSet<>();
      Scanner sc = new Scanner(System.in);
      double num;
      
      while(true){
           try {
           System.out.println("Digite um número: ");
           num = sc.nextDouble();
           d.add(num);
           } catch(Exception e) {
               break;
           }
        }
      
      double totalVal = 0;
      totalVal = d.stream().reduce(totalVal, Double::sum);
      Stream<Double> values = d.stream();
      System.out.println("Valores na Lista: ");
      values.forEach(v -> System.out.println(v));
      System.out.println("Soma dos Valores: " + totalVal);
      
    }
    
}
