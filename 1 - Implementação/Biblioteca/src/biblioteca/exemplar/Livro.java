package biblioteca.exemplar;

public class Livro extends Titulo {
    private String autor;
    private String ISBN;

    public Livro() {

    }

    public Livro(int id, int numeroExemplares, int periodoMaximoEmprestimo, String descricao, boolean disponivel,
            String nome, String autor, String ISBN) {
        super(id, numeroExemplares, periodoMaximoEmprestimo, descricao, disponivel, nome);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
