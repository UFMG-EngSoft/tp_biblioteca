package biblioteca.exemplar;

public class Titulo {
  protected int id;
  protected int numeroExemplares;
  protected int periodoMaximoEmprestimo;
  protected String descricao;
  protected boolean disponivel;
  protected String nome;

  public void mudarDisponibilidade() {

  }

  public Titulo() {

  }

  public Titulo(int id, int numeroExemplares, int periodoMaximoEmprestimo, String descricao, boolean disponivel,
      String nome) {
    this.id = id;
    this.numeroExemplares = numeroExemplares;
    this.periodoMaximoEmprestimo = periodoMaximoEmprestimo;
    this.descricao = descricao;
    this.disponivel = disponivel;
    this.nome = nome;
  }
}
