import java.util.Scanner;

public class CalculoDistancia {
    Scanner entradaTeclado = new Scanner(System.in);
    public void distancia() {
        System.out.println("Digite uma distancia em metros: ");
        double metros = entradaTeclado.nextDouble();

        System.out.println("   Unidades de distancia");
        System.out.println("Digite o numero correspondente a distancia que quer calcular: ");
        System.out.println("1 - KM \n 2 - HM \n 3 - DAM \n 4 - DM \n 5 - CM \n 6- MM .\n 7 - SAIR");

        int escolha = entradaTeclado.nextInt();
        while (escolha != 7) {
            if (escolha == 1) {
                double km = metros / 1000;
                System.out.println(km + " km");
            }
            if (escolha == 2) {
                double hm = metros / 100;
                System.out.println(hm + " hm");
            }
            if (escolha == 3) {
                double dam = metros / 10;
                System.out.println(dam + "dam");
            }
            if (escolha == 4) {
                double dm = metros * 10;
                System.out.println(dm + "dm");
            }
            if (escolha == 5) {
                double cm = metros * 100;
                System.out.println(cm + " cm");
            }
            if (escolha == 6) {
                double mm = metros * 1000;
                System.out.println(mm + " mm");
            }
            System.out.println("Deseja continuar? Digite qual distancia quer: ");
            escolha = entradaTeclado.nextInt();
        }
        if (escolha == 7) {
            System.out.println("Fim! ");
        }
    }
}
