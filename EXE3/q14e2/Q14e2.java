package q14e2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q14e2 {

    public static void main(String[] args) {     
        
        Scanner sc = new Scanner(System.in);
        String nome = "";
        int telefone;  
        int s;
        Map<String,Integer> nt = new HashMap<>();
       
        while(!nome.equals("*")) {
            System.out.println("Digite '*' para sair");
            System.out.println("Digite o nome: ");
            nome = sc.next();
            if(nome.equals("*")) continue;
            System.out.println("Digite um telefone: ");
            telefone = sc.nextInt();
            nt.put(nome, telefone );            
            System.out.println(nt);
        }   
        
        while(true) {
            System.out.println("Digite 1 para pesquisar pelo nome inteiro");
            System.out.println("Digite 2 para pesquisar pela letra inicial");
            s = sc.nextInt();
            
            switch (s) {
                case 1:
                    System.out.println("Digite o nome para pesquisa: ");
                    String nomeK = sc.next();
                    Map<String,Integer> resultado1 = nt.entrySet()
                    .stream()
                    .filter(map -> map.getKey().equals(nomeK))
                    .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())); 
                    System.out.println("Telefone: " + resultado1.values());
                    break;
                case 2:
                    System.out.println("Digite a letra sobre o perfil que quer encontrar");
                    String fl = sc.next();
                    Map<String,Integer> resultado = nt.entrySet()
                    .stream()
                    .filter(map -> map.getKey().startsWith(fl))
                    .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())); 
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            break;
        }
    }    
}
    
   

