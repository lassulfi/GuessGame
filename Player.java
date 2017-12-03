public class Player{

  //Atributos

  int number = 0; //Palpite

  //Métodos

  public void guess(){
    number = (int) (Math.random() * 10);
    System.out.println("Estou pensando em: " + number);
  }
}
