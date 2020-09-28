package Main;

import java.util.List;

public class Autor {
    
    private String name;
    private List<Livro> livros;


    public Autor(String name, List<Livro> livros) {
        this.name = name;
        this.livros = livros;
    }

    public Autor() {
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
