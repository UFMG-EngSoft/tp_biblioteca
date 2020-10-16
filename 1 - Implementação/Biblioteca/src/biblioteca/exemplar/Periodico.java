package biblioteca.exemplar;

public class Periodico extends Titulo {
  private String editora;
  private String ISSN;

  public Periodico() {

  }

  public Periodico(int id, int numeroExemplares, int periodoMaximoEmprestimo, String descricao, boolean disponivel,
      String nome, String editora, String ISSN) {
    super(id, numeroExemplares, periodoMaximoEmprestimo, descricao, disponivel, nome);
    this.editora = editora;
    this.ISSN = ISSN;
  }
}
