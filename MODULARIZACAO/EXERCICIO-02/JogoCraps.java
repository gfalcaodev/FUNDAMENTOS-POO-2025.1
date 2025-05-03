import java.util.Random;
import java.util.Scanner;

class Dado {
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int rolar() {
        return random.nextInt(6) + 1;
    }
}

class CrapsGame {
    private Dado dado1;
    private Dado dado2;
    private int pontos;
    private boolean jogoAtivo;

    public CrapsGame() {
        dado1 = new Dado();
        dado2 = new Dado();
        pontos = 0;
        jogoAtivo = true;
    }

    public void jogar() {
        Scanner ler = new Scanner(System.in);

        int soma = rolarDados();
        System.out.println("Resultado do primeiro lançamento: " + soma);

        if (soma == 7 || soma == 11) {
            System.out.println("Voce ganhou com "+ soma +"!");
            jogoAtivo = false;
        } else {
            if (soma == 2 || soma == 3 || soma == 12) {
                System.out.println("Voce perdeu com "+ soma +". Craps!");
                jogoAtivo = false;
            } else {
                System.out.println("Sua pontuação é " + pontos + ". Continue rolando ate tirar sua pontuação ou um 7.");
            }
        }

        while (jogoAtivo) {
            System.out.println("Pressione Enter Para rolar os dados.");
            ler.nextLine();

            soma = rolarDados();
            System.out.println("Resultado do lancamento: "+ soma);

            if (soma == pontos) {
                System.out.println("Você fez sua pontuação! Voce ganhou!");
                jogoAtivo = false;
            } else {
                if (soma == 7) {
                    System.out.println("Você perdeu com um 7.");
                    jogoAtivo = false;
                }
            }
        }
    }

    private int rolarDados() {
        return dado1.rolar() + dado2.rolar();
    }
}

public class JogoCraps {
    public static void main(String[] args) {
        CrapsGame game = new CrapsGame();
        game.jogar();
    }
}
