package main;

public class Carta {
    
    private String naipe;
    private String num;

    public Carta(String num, String naipe) {
        this.setNaipe(naipe);
        this.setNum(num);
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe){
        if(naipe.equalsIgnoreCase("copas") || naipe.equalsIgnoreCase("ouros") 
                || naipe.equalsIgnoreCase("espadas") || naipe.equalsIgnoreCase("paus")){
        this.naipe = naipe;
        }else{
            throw new RuntimeException ("Naipe errado");
        }
    }

    public String getNum() {
       return num;
    }

    public void setNum(String num) {
        if(num.equalsIgnoreCase("A") || num.equalsIgnoreCase("Q") || num.equalsIgnoreCase("K") || num.equalsIgnoreCase("J")
                || num.equals("2") || num.equals("3") || num.equals("4") || num.equals("5") || num.equals("6") || num.equals("7")
                || num.equals("8") || num.equals("9") || num.equals("10")){
        this.num = num;
        }else
            throw new RuntimeException ("Numero errado");
        }
    
     public String imprimeCarta(){
        
        return num.toUpperCase() + " de " + naipe.toLowerCase();  
    }
    
}