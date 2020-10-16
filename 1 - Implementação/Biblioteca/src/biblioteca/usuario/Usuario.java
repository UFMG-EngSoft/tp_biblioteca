package biblioteca.usuario;

import java.util.Date;

public class Usuario {
  protected int id;
  protected String nome;
  protected String sexo;
  protected Date dataNascimento;
  protected String login;
  protected String senha;

  public boolean solicitarEmprestimo() {
    System.out.println("Empréstimo realizado com sucesso!");
    return true;
  }

  public boolean realizarDevolucao() {
    System.out.println("Devolução realizada com sucesso!");
    return true;
  }

  public Usuario() {

  }

  public Usuario(int id, String nome, String sexo, Date dataNascimento, String login, String senha) {
    this.id = id;
    this.nome = nome;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
    this.login = login;
    this.senha = senha;
  }

  public String getNome() {
    return this.nome;
  }
}
