package biblioteca.exemplar;

public class Jornal extends Titulo {
  private String editorChefe;

  public Jornal() {

  }

  public Jornal(int id, int numeroExemplares, int periodoMaximoEmprestimo, String descricao, boolean disponivel,
      String nome, String editorChefe) {
    super(id, numeroExemplares, periodoMaximoEmprestimo, descricao, disponivel, nome);
    this.editorChefe = editorChefe;
  }

  /**
   * @return String return the editorChefe
   */
  public String getEditorChefe() {
    return editorChefe;
  }

  /**
   * @param editorChefe the editorChefe to set
   */
  public void setEditorChefe(String editorChefe) {
    this.editorChefe = editorChefe;
  }
}
