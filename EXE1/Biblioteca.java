package Main;

import java.util.List;


public class Biblioteca {
    
    private String name;
    private List<Livro> livros;

    public List<Livro> getLivros() {
        return livros;
    }

    public Biblioteca() {
    }

    public Biblioteca(String name, List<Livro> livros) {
        this.name = name;
        this.livros = livros;
    }

    public void setLivro(List<Livro> livros) {
        this.livros = livros;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
