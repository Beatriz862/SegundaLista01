package AutorLivro;

public class Livro {
    
    private String nome;
    
    public Livro(String nome){
        
        this.nome = nome;
        
    }
    
    public String getNome(String nome){
        return this.nome;
    }
    public <Autor> void relacionarLivroAutor(Autor autor){
        
        System.out.println("autor" + "possui"+autor.getNome());
        
    }
    
}
