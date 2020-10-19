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
}
