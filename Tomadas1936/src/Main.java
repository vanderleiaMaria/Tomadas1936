import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //declarar variaveis e ler os valores
        int T1 = scanner.nextInt();
        int T2 = scanner.nextInt();
        int T3 = scanner.nextInt();
        int T4 = scanner.nextInt();
// soma as entrada e subtraia por 3 pois cada tomada foi utiliza um entrada para conectar as outras
        int totalDeTomadas = T1 + T2 + T3 + T4 - 3;
//mostra o total de tomadas
        System.out.println(totalDeTomadas);

        scanner.close();
    }
}