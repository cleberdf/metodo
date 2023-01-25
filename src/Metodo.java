//if...else dentro dos métodos
public class Metodo {
  static void checandoIdade(int idade) {
    if (idade < 18) {
      System.out.println("Aceso negado - você não tem idade suficiente! ");
    } else {
      System.out.println("Acesso permitido - você tem idade suficiente! ");
    }
  }

  public static void main(String[] args) {
    checandoIdade(20);
  }
}