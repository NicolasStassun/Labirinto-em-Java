public class Jogador {

    int posicaoY = 0;
    int posicaoX = 8;

    void movimentar(String movimento, String[][] cenario){
        switch (movimento.toLowerCase()) {
            case "w" -> {
            if(cenario[posicaoX-1][posicaoY] == "[ㅤ]" || cenario[posicaoX-1][posicaoY] =="[💨]"){
                posicaoX -= 1;
            }
            else {
                System.out.println("Voce caiu numa bomba");
                System.exit(0);
            }
            }
            case "s" -> {
                if(cenario[posicaoX+1][posicaoY] == "[ㅤ]" || cenario[posicaoX+1][posicaoY] =="[💨]"){
                    posicaoX += 1;
                }
                else {
                    System.out.println("Voce caiu numa bomba");
                    System.exit(0);
                }
            }
            case "a" -> {
                if(cenario[posicaoX][posicaoY-1] == "[ㅤ]" || cenario[posicaoX][posicaoY-1] =="[💨]"){
                    posicaoY -= 1;
                }
                else {
                    System.out.println("Voce caiu numa bomba");
                    System.exit(0);
                }
            }
            case "d" -> {
                if(cenario[posicaoX][posicaoY+1] == "[ㅤ]" || cenario[posicaoX][posicaoY+1] =="[💨]"){
                    posicaoY += 1;
                }
                else {
                    System.out.println("Voce caiu numa bomba");
                    System.exit(0);
                }
            }
            default -> System.out.println("Erro");
        }
    }

    @Override
    public String toString() {
        return "[‍👤]";
    }
}
