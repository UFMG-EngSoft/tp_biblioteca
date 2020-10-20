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

  /**
   * @return int return the id
   */
  public int getId() {
      return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
      this.id = id;
  }

  /**
   * @return int return the numeroExemplares
   */
  public int getNumeroExemplares() {
      return numeroExemplares;
  }

  /**
   * @param numeroExemplares the numeroExemplares to set
   */
  public void setNumeroExemplares(int numeroExemplares) {
      this.numeroExemplares = numeroExemplares;
  }

  /**
   * @return int return the periodoMaximoEmprestimo
   */
  public int getPeriodoMaximoEmprestimo() {
      return periodoMaximoEmprestimo;
  }

  /**
   * @param periodoMaximoEmprestimo the periodoMaximoEmprestimo to set
   */
  public void setPeriodoMaximoEmprestimo(int periodoMaximoEmprestimo) {
      this.periodoMaximoEmprestimo = periodoMaximoEmprestimo;
  }

  /**
   * @return String return the descricao
   */
  public String getDescricao() {
      return descricao;
  }

  /**
   * @param descricao the descricao to set
   */
  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }

  /**
   * @return boolean return the disponivel
   */
  public boolean isDisponivel() {
      return disponivel;
  }

  /**
   * @param disponivel the disponivel to set
   */
  public void setDisponivel(boolean disponivel) {
      this.disponivel = disponivel;
  }

  /**
   * @return String return the nome
   */
  public String getNome() {
      return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
      this.nome = nome;
  }

  /**
   * @return List<Exemplar> return the exemplares
   */
  public List<Exemplar> getExemplares() {
      return exemplares;
  }

  /**
   * @param exemplares the exemplares to set
   */
  public void setExemplares(List<Exemplar> exemplares) {
      this.exemplares = exemplares;
  }

}
