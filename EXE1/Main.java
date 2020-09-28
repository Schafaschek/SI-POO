package Main;

import java.util.List;

public class Main {

 
    public static void main(String[] args) {
        
        Autor autor1 = new Autor();
        Livro livro1 = new Livro();
        Biblioteca biblioteca1 = new Biblioteca();
        Capitulo capitulo1 = new Capitulo();
        
        autor1.setName("Pedro");
        capitulo1.setNum(2);
        livro1.setAutor(autor1);
        livro1.setISBN("ISBN1");
        biblioteca1.setName("Biblioteca");
        livro1.setBiblioteca(biblioteca1);
        capitulo1.setLivro(livro1);
        livro1.setCapitulos((List<Capitulo>) capitulo1);
        biblioteca1.setLivro((List<Livro>) livro1);
        autor1.setLivros((List<Livro>) livro1);
        
        System.out.println("Autor: " + livro1.getAutor().getName());
        System.out.println("Biblioteca: " + livro1.getBiblioteca().getName());
        System.out.println("ISBN: " + livro1.getISBN());
        
        
        
    }
    
}
