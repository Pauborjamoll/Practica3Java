import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] billetes = {{500, 1}, {200, 3}, {100, 0}, {50, 0},
                {20, 0}, {10, 18}, {5, 25}};

        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico();

        cajeroAutomatico.setBilletes(billetes);

        TarjetaDebito  = new TarjetaDebito("12345678a", 1111, "Pau", "Segovia", 10000);
        TarjetaCredito  = new TarjetaCredito("12345678b", 2222, "Pau", "Escandell", 1000, 4000);
        CajeroAutomatico.getTarjeta().add(TarjetaDebito);
        CajeroAutomatico.getTarjeta().add(TarjetaCredito);


        while (true) {
            Scanner scanner = new Scanner(System.in);
            cajeroAutomatico.mostrarCajero();

            System.out.println("----------MENU-----------");
            System.out.println("1. Sacar dinero.");
            System.out.println("2. Mostrar tarjetas.");
            System.out.println("3. Salir");
            System.out.println("-------------------------");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    CajeroAutomatico.sacarDinero();
                    break;
                case 2:
                    Tarjeta tarjeta = new Tarjeta();
                    System.out.println(CajeroAutomatico.getTarjeta().toString());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    return;
            }
        }
    }
}
