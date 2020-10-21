package biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import biblioteca.exemplar.Livro;
import biblioteca.exemplar.Titulo;
import biblioteca.usuario.Aluno;
import biblioteca.usuario.Professor;
import biblioteca.usuario.Usuario;

public class Sistema {
  boolean executando;

  Usuario usuario;
  List<Titulo> titulos;

  private boolean autenticarUsuario(String login, String senha) {
    boolean usuarioValido = true;
    if (login.equals("professor")) {
      this.usuario = new Professor(1, "Girafales", "M", new Date(15, 6, 1934), login, senha);
    } else if (login.equals("aluno")) {
      this.usuario = new Aluno(2, "Chiquinha", "F", new Date(22, 12, 1950), login, senha, "1Z2A3X");
    } else {
      usuarioValido = false;
    }
    return usuarioValido;
  }

  private void encerrarSessao() {
    System.out.println("\nFoi um prazer rever você " + usuario.getNome() + ", até mais!");
    usuario = new Usuario();
  }

  private void encerrarExecucao() {
    this.encerrarSessao();
    this.executando = false;
    System.out.println("\nO sistema será encerrado.");
  }

  private void mostrarTelaLogin() {
    Scanner leitor = new Scanner(System.in);
    String login, senha;
    System.out.println("\nPor favor, insira os dados abaixo para prosseguir: ");
    System.out.print("Usuário: ");
    login = leitor.next();
    System.out.print("Senha: ");
    senha = leitor.next();
    if (autenticarUsuario(login, senha)) {
      System.out.println("\nOlá Sr(a) " + this.usuario.getNome() + ", que milagre você por aqui!");
    } else {
      System.out.println("Login e/ou senha incorretos, por favor tente novamente.");
    }
  }

  private void mostrarTelaPrincipal() {
    Scanner leitor = new Scanner(System.in);
    String opcao;
    System.out.println("\nO que deseja fazer?");
    if (this.usuario instanceof Professor) {
      System.out.println("0 - Solicitar configuração de disponibilidade de título");
    }
    System.out.println("1 - Solicitar empréstimo");
    System.out.println("2 - Devolver um título");
    System.out.println("3 - Pagar multa por atraso");
    System.out.println("4 - Indicar perda");
    System.out.println("5 - Assinar um periódico");
    System.out.println("6 - Encerrar a sessão");
    System.out.println("7 - Encerrar o sistema");
    System.out.print("Opção: ");
    opcao = leitor.next();
    switch (opcao) {
      case "0":
        if (this.usuario instanceof Professor) {
          ((Professor) this.usuario).configurarDisponibilidadeTitulo();
        } else {
          System.out.println("Opção inválida");
        }
        break;
      case "1":
        this.usuario.solicitarEmprestimo();
        break;
      case "2":
        this.usuario.realizarDevolucao();
        break;
      case "3":
        this.usuario.pagarMultaPorAtraso();
        break;
      case "4":
        this.usuario.indicarPerda();
        break;
      case "5":
        this.usuario.assinarPeriodico();
        break;
      case "6":
        this.encerrarSessao();
        break;
      case "7":
        this.encerrarExecucao();
        break;
      default:
        System.out.println("Opção inválida");
    }
  }

  private boolean carregarTitulos() {
    this.titulos = new ArrayList<>();
    return true;
  }

  private void iniciarLoopExecucao() {
    System.out.println("\nSISTEMA PARA GESTÃO DE BIBLIOTECA");
    carregarTitulos();
    while (executando) {
      if (!usuario.estaLogado) {
        mostrarTelaLogin();
      } else {
        mostrarTelaPrincipal();
      }
    }
  }

  public Sistema() {
    executando = true;
    usuario = new Usuario();
    iniciarLoopExecucao();
  }
}
