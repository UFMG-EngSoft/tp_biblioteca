package biblioteca.assinatura;

public class Assinatura {
  private int idPeriodico;
  private int idUsuario;

  public Assinatura() {

  }

  public Assinatura(int idPeriodico, int idUsuario) {
    this.idPeriodico = idPeriodico;
    this.idUsuario = idUsuario;
  }

  /**
   * @return int return the idPeriodico
   */
  public int getIdPeriodico() {
    return idPeriodico;
  }

  /**
   * @param idPeriodico the idPeriodico to set
   */
  public void setIdPeriodico(int idPeriodico) {
    this.idPeriodico = idPeriodico;
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

}
