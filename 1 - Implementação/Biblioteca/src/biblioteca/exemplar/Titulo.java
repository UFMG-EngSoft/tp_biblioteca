package biblioteca.exemplar;

import java.util.ArrayList;
import java.util.List;

public class Titulo {
  protected int id;
  protected int numeroExemplares;
  protected int periodoMaximoEmprestimo;
  protected String descricao;
  protected boolean disponivel;
  protected String nome;
  protected List<Exemplar> exemplares;

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
    this.exemplares = new ArrayList<>();
  }

  public Titulo(int id, int numeroExemplares, int periodoMaximoEmprestimo, String descricao, boolean disponivel,
      String nome, List<Exemplar> exemplares) {
    this.id = id;
    this.numeroExemplares = numeroExemplares;
    this.periodoMaximoEmprestimo = periodoMaximoEmprestimo;
    this.descricao = descricao;
    this.disponivel = disponivel;
    this.nome = nome;
    this.exemplares = exemplares;
  }
}
