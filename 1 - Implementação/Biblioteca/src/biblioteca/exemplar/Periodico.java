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

  /**
   * @return String return the editora
   */
  public String getEditora() {
      return editora;
  }

  /**
   * @param editora the editora to set
   */
  public void setEditora(String editora) {
      this.editora = editora;
  }

  /**
   * @return String return the ISSN
   */
  public String getISSN() {
      return ISSN;
  }

  /**
   * @param ISSN the ISSN to set
   */
  public void setISSN(String ISSN) {
      this.ISSN = ISSN;
  }

}
