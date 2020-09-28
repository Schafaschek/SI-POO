
package Main;


public class Capitulo {
    
    private int num;
    private Livro livro;

    public Livro getLivro() {
        return livro;
    }

    public Capitulo() {
    }
    
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    
    public Capitulo(Livro livro, int num){
            this.livro = livro;
            this.num = num;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
