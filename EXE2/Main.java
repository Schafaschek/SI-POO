package main;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        try{
        Carta carta = new Carta ("Q", "paus");
        //Carta carta2 = new Carta("10", "copas");
        //ArrayList<Carta> cartas = new ArrayList<>();
        //cartas.add(carta);
        //cartas.add(carta2);
        //Baralho baralho = new Baralho(cartas);
        //baralho.impressao();
        
        Baralho baralho2 = new Baralho();
        baralho2.impressao();
        baralho2.tirarCartas();
        baralho2.embaralharCartas();
        
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        
 
        
    }
    
}
