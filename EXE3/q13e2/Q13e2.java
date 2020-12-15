package q13e2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q13e2 {

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
                    nome = sc.next();
                    System.out.println("Telefone: " + nt.get(nome));
                    break;
                case 2:
                    System.out.println("Digite a letra sobre o perfil que quer encontrar");
                    String fl = sc.next();
                    nt.entrySet().forEach((key) -> {
                        if(key.getKey().startsWith(fl)){
                            System.out.println(key);
                        }
                    });
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            break;
        }
    }  
}
    

