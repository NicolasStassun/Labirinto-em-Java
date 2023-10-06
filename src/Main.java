import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();
        Labirinto labirinto = new Labirinto(jogador);
        do {
            labirinto.mostraCenario();
            try {
                jogador.movimentar(sc.next(), labirinto.getCenario());
            } catch (Exception e) {
                e.getMessage();
            }
            labirinto.montaLabirinto(jogador);
        }while(jogador.posicaoX != 0 || jogador.posicaoY != 8);
        System.out.println("Você ganhou o jogo!");
    }

}
