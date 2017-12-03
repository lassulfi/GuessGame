public class GuessGame{

  //Atributos
  Player p1;
  Player p2;
  Player p3;

  //Métodos
  public void startGame(){

    //Cria os objetos correspondentes aos 3 players do jogo
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    //Cria as variáveis para armazenar o palpite dos jogadores
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    //Cria as variáveis para armazenar qual jogador adivinhou o palpite
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    //Cria um número que os players deverão advinhar
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("Estou pensando em um número entre 0 e 9...");

    //Inicio dos palpites
    while(true){
      System.out.println("O número a advinhar é " + targetNumber);

      //Cada player faz o seu palpite
      p1.guess();
      p2.guess();
      p3.guess();

      //Armazena os palpites locamente para realizar a avaliação
      guessp1 = p1.number;
      System.out.println("O jogador 1 forneceu o palpite " + guessp1);
      guessp2 = p2.number;
      System.out.println("O jogador 2 forneceu o palpite " + guessp2);
      guessp3 = p3.number;
      System.out.println("O jogador 3 forneceu o palpite " + guessp3);

      //Valida os palpites
      if (guessp1 == targetNumber) {
        p1isRight = true;
      }
      if (guessp2 == targetNumber) {
        p2isRight = true;
      }
      if (guessp3 == targetNumber) {
        p3isRight = true;
      }

      //Valida o vencedor
      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("Temos um vencedor!");
        System.out.println("O jogador 1 acertou? " + p1isRight);
        System.out.println("O jogador 2 acertou? " + p2isRight);
        System.out.println("O jogador 3 acertou? " + p3isRight);
        break; //Fim do jogo
      } else {
        System.out.println("Ninguém acertou. Os jogadores terão que tentar novamente.");
      }
    }
  }
}
