package AutorLivro;

public class Main {

    public static void main (String[] args){

        Autor autor  = new autor("joice");
        Livro livro = new livro("a culpa é das estrelas");
        livro.relacionarLivroAutor(autor);
        livro.relacionarLivroAutor(autor2);

    }
}
