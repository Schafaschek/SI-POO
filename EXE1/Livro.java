package Main;

import java.util.List;

public class Livro {
    
    private String ISBN;
    private Autor autor;
    private List<Capitulo> capitulos;
    private Biblioteca biblioteca;

    public Livro(String ISBN, Autor autor, List<Capitulo> capitulos, Biblioteca biblioteca) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.capitulos = capitulos;
        this.biblioteca = biblioteca;
    }

    public Livro() {
    }
    

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
}
