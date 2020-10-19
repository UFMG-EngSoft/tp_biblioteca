package biblioteca.usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import biblioteca.emprestimo.Emprestimo;

public class Usuario {
  protected int id;
  protected String nome;
  protected String sexo;
  protected Date dataNascimento;
  protected String login;
  protected String senha;
  public boolean estaLogado;

  List<Emprestimo> emprestimos;

  private void carregarEmprestimos() {
    // busca na base de dados os emprestimos daquele usuario

    // para fins de implementacao, utilizamos dados mockados
    this.emprestimos = new ArrayList<Emprestimo>();
    emprestimos.add(new Emprestimo(1, 1, true, new Date(15, 10, 2020), null, new Date(1, 12, 2020), 0));
    emprestimos.add(new Emprestimo(2, 1, true, new Date(15, 10, 2020), null, new Date(1, 12, 2020), 0));
  }

  public boolean solicitarEmprestimo() {
    System.out.println("Empréstimo realizado com sucesso!");
    return true;
  }

  public boolean realizarDevolucao() {

    System.out.println("Devolução realizada com sucesso!");
    return true;
  }

  public String getNome() {
    return this.nome;
  }

  public Usuario() {
    estaLogado = false;
  }

  public Usuario(int id, String nome, String sexo, Date dataNascimento, String login, String senha) {
    this.id = id;
    this.nome = nome;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
    this.login = login;
    this.senha = senha;
    this.estaLogado = true;
    this.carregarEmprestimos();
  }

  public Usuario(int id, String nome, String sexo, Date dataNascimento, String login, String senha,
      boolean estaLogado) {
    this.id = id;
    this.nome = nome;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
    this.login = login;
    this.senha = senha;
    this.estaLogado = estaLogado;
    this.carregarEmprestimos();
  }
}
