public class Labirinto {


    private String bomba = "[\uD83D\uDCA3]";
    private String espacoVazio = "[ㅤ]";
    private String saida = "[\uD83D\uDCA8]";
    private String[][] cenario = new String[9][9];

    public Labirinto(Jogador jogador) {
        montaLabirinto(jogador);
    }
    void montaLabirinto(Jogador jogador){
        cenario = new String[][]{
                {bomba, bomba, bomba, bomba, bomba, bomba, bomba, espacoVazio, saida},
                {bomba, espacoVazio, espacoVazio, espacoVazio, bomba, espacoVazio, espacoVazio, espacoVazio, bomba},
                {bomba, bomba, bomba, espacoVazio, bomba, espacoVazio, bomba, bomba, bomba},
                {bomba, bomba, bomba, espacoVazio, espacoVazio, espacoVazio, espacoVazio, espacoVazio, bomba},
                {bomba, espacoVazio, bomba, bomba, bomba, bomba, bomba, espacoVazio, bomba},
                {bomba, espacoVazio, espacoVazio, espacoVazio, espacoVazio, espacoVazio, bomba, espacoVazio, bomba},
                {bomba, espacoVazio, bomba, bomba, bomba, bomba, bomba, espacoVazio, bomba},
                {espacoVazio, espacoVazio, espacoVazio, espacoVazio, espacoVazio, espacoVazio, espacoVazio, espacoVazio, bomba},
                {espacoVazio, bomba, bomba, bomba, bomba, bomba, bomba, bomba, bomba}};
        cenario[jogador.posicaoX][jogador.posicaoY] = jogador.toString();
    }
    void mostraCenario(){
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                System.out.print(cenario[x][y]);
            }
            System.out.println();
        }
    }

    public String[][] getCenario() {
        return cenario;
    }

}
