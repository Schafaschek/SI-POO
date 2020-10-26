package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {
    private ArrayList<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        baralhoPronto();
    }
    
    public Baralho(ArrayList<Carta> cartas){
        this.cartas = cartas;
    }
    
 private void baralhoPronto() {
        String num[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String naipe[] = {"Espadas","Copas","Ouros","Paus"};
          for(int i = 0; i < 13; i++){
                for(int j = 0; j < 4; j++){
                    adicionaCarta(num[i], naipe[j]);
                }
            }
    }

 public void adicionaCarta(String num, String naipe) {
        Carta novaCarta = new Carta(num, naipe);
        cartas.add(novaCarta);
    }
    
    public void embaralharCartas(){ 
        int quantidade = 52;
        List<Integer> baralhoAleatorio = new ArrayList<>();
        int sorteio;
        System.out.println("\nEmbaralhamento de Cartas: ");
        do {
            boolean adicionarLista = true;
            sorteio = (int) (Math.random() * 52); 
            for (int i : baralhoAleatorio){
                if (i == sorteio) {
                    adicionarLista = false;
                    break;
                }
            }
            if (adicionarLista) { baralhoAleatorio.add(sorteio); }
        }while (baralhoAleatorio.size() < quantidade);
            for (int x : baralhoAleatorio) {
                    System.out.println(cartas.get(x).imprimeCarta());
            }
    }
    
    public void tirarCartas(){
        Random gerador = new Random();
        System.out.println("\nCarta retirada: " + cartas.get(gerador.nextInt(52)).imprimeCarta());
    }
 
    public void impressao() {
         try{
            for(int i = 0; i < 52;i++){
                System.out.println(cartas.get(i).imprimeCarta());
            }
         }catch(Exception e){
            System.out.println("Erro: Um baralho completo necessita de 52 cartas");     
        }        
    }
}
