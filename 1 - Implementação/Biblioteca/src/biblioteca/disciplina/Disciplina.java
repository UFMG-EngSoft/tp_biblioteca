package biblioteca.disciplina;

public class Disciplina {
  private int id;
  private String nome;

  public Disciplina() {

  }

  public Disciplina(int id, String nome) {
    this.id = id;
    this.nome = nome;
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

}
