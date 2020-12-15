package q13e1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q13e1 {

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
        
        Iterator<Double> order = d.iterator();
        if(!d.isEmpty()){
            System.out.println("Lista: ");
            while(order.hasNext()){
                System.out.println(order.next());
            }
        }else{
            System.out.println("Lista vazia!");
        }
    }
    
}
