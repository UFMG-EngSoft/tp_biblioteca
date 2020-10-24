package biblioteca.usuario;

import java.util.Date;

public class Aluno extends Usuario {
  private String matricula;

  public Aluno() {

  }

  public Aluno(int id, String nome, String sexo, Date dataNascimento, String login, String senha, String matricula) {
    super(id, nome, sexo, dataNascimento, login, senha);
    this.matricula = matricula;
  }

  /**
   * @return String return the matricula
   */
  public String getMatricula() {
    return matricula;
  }

  /**
   * @param matricula the matricula to set
   */
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
}
