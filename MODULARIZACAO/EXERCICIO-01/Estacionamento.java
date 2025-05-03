import java.util.Scanner;
public class Estacionamento {

    public static double calcularTarifa(double horas)     {
        double tarifa = 5.0;
        if (horas > 3) {
            tarifa += (horas -3) *1.0;
        }
        if (tarifa > 30.0) {
            tarifa = 30.0;
        }
        return tarifa;
    }

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double horaEntrada, horaSaida, horasEstacionadas, tarifa;
        double totalRecebidos = 0.0;
        boolean continuar = true;
        String resposta;
        
        while (continuar) {
            System.out.println("Digite a hora de entrada (Formato 24h, exemplo 14,5 para 14h30)");
            horaEntrada = dado.nextDouble();

            System.out.println("Digite a hora de saida (Formato 24h, exemplo 14,5 para 14h30)");
            horaSaida = dado.nextDouble();

            horasEstacionadas = horaSaida - horaEntrada;

            tarifa = calcularTarifa(horasEstacionadas);

            System.out.printf("A tarifa para este cliente é R$ %.2f\n", tarifa);

            totalRecebidos += tarifa;

            System.out.println("Deseja registrar outro cliente? (sim/nao): ");
            resposta = dado.next();

            if (resposta.equalsIgnoreCase("nao")) {
                continuar = false;
            }
        }
        System.out.printf("O total arrecadado no dia foi R$ %.2f\n", totalRecebidos);

        dado.close();
    }
}
