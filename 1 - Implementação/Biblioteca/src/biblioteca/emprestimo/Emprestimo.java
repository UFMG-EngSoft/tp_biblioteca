package biblioteca.emprestimo;

import java.util.Date;

public class Emprestimo {
  private int idExemplar;
  private int idUsuario;
  private boolean ativo;
  private Date dataEmprestimo;
  private Date dataDevolucao;
  private Date dataPrevistaDevolucao;
  private float valorMulta;

  public Emprestimo() {

  }

  public Emprestimo(int idExemplar, int idUsuario, boolean ativo, Date dataEmprestimo, Date dataDevolucao,
      Date dataPrevistaDevolucao, float valorMulta) {
    this.idExemplar = idExemplar;
    this.idUsuario = idUsuario;
    this.ativo = ativo;
    this.dataEmprestimo = dataEmprestimo;
    this.dataDevolucao = dataDevolucao;
    this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    this.valorMulta = valorMulta;
  }

  private void calcularMulta() {

  }

  public boolean validarEmprestimo() {
    return true;
  }

  /**
   * @return int return the idExemplar
   */
  public int getIdExemplar() {
      return idExemplar;
  }

  /**
   * @param idExemplar the idExemplar to set
   */
  public void setIdExemplar(int idExemplar) {
      this.idExemplar = idExemplar;
  }

  /**
   * @return int return the idUsuario
   */
  public int getIdUsuario() {
      return idUsuario;
  }

  /**
   * @param idUsuario the idUsuario to set
   */
  public void setIdUsuario(int idUsuario) {
      this.idUsuario = idUsuario;
  }

  /**
   * @return boolean return the ativo
   */
  public boolean isAtivo() {
      return ativo;
  }

  /**
   * @param ativo the ativo to set
   */
  public void setAtivo(boolean ativo) {
      this.ativo = ativo;
  }

  /**
   * @return Date return the dataEmprestimo
   */
  public Date getDataEmprestimo() {
      return dataEmprestimo;
  }

  /**
   * @param dataEmprestimo the dataEmprestimo to set
   */
  public void setDataEmprestimo(Date dataEmprestimo) {
      this.dataEmprestimo = dataEmprestimo;
  }

  /**
   * @return Date return the dataDevolucao
   */
  public Date getDataDevolucao() {
      return dataDevolucao;
  }

  /**
   * @param dataDevolucao the dataDevolucao to set
   */
  public void setDataDevolucao(Date dataDevolucao) {
      this.dataDevolucao = dataDevolucao;
  }

  /**
   * @return Date return the dataPrevistaDevolucao
   */
  public Date getDataPrevistaDevolucao() {
      return dataPrevistaDevolucao;
  }

  /**
   * @param dataPrevistaDevolucao the dataPrevistaDevolucao to set
   */
  public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
      this.dataPrevistaDevolucao = dataPrevistaDevolucao;
  }

  /**
   * @return float return the valorMulta
   */
  public float getValorMulta() {
      return valorMulta;
  }

  /**
   * @param valorMulta the valorMulta to set
   */
  public void setValorMulta(float valorMulta) {
      this.valorMulta = valorMulta;
  }

}
