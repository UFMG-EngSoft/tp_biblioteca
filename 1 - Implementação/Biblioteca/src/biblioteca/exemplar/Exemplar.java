package biblioteca.exemplar;

public class Exemplar {
  private int id;
  private int edicao;

  public Exemplar() {

  }

  public Exemplar(int id, int edicao) {
    this.id = id;
    this.edicao = edicao;
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
   * @return int return the edicao
   */
  public int getEdicao() {
      return edicao;
  }

  /**
   * @param edicao the edicao to set
   */
  public void setEdicao(int edicao) {
      this.edicao = edicao;
  }

}
