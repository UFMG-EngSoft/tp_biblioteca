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
}
