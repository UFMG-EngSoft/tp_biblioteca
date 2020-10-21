package biblioteca.usuario;

import java.util.Date;

public class Professor extends Usuario {
  public Professor() {

  }

  public Professor(int id, String nome, String sexo, Date dataNascimento, String login, String senha) {
    super(id, nome, sexo, dataNascimento, login, senha);
  }

  public boolean configurarDisponibilidadeTitulo() {
    System.out.println("Disponibilidade configurada com sucesso!");
    return true;
  }
}
