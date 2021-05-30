import java.util.ArrayList;
import java.util.Scanner;

public class CajeroAutomatico {
    static Integer idUltCaj = 0;
    private Integer idCaj;
    private int[][] billetes;
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();

    public CajeroAutomatico() {
    }

    public CajeroAutomatico(int[][] dinero, ArrayList<Tarjeta> tarjetas) {
        setIdCaj(++idUltCaj);
        setBilletes(dinero);
        setTarjetas(tarjetas);
        setIdUltCaj(this.idCaj);
    }

    public static Integer getIdUltCaj() {
        return idUltCaj;
    }

    public static void setIdUltCaj(Integer idUltCaj) {
        CajeroAutomatico.idUltCaj = idUltCaj;
    }

    public Integer getIdCaj() {
        return idCaj;
    }

    public void setIdCaj(Integer idCaj) {
        this.idCaj = idCaj;
    }

    public int[][] getBilletes() {
        return billetes;
    }

    public void setBilletes(int[][] Billetes) {
        this.billetes = billetes;
    }

    public ArrayList<Tarjeta> getTarjeta() {
        return Tarjeta;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public void mostrarCajero() {
        for (int i = 0; i < getBilletes().length; i++) {
            System.out.println(getBilletes()[i][1] + " billetes de " + getBilletes()[i][0] + " €");
        }
    }
    public void sacarDinero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce NIF: ");
        String NIF = scanner.nextLine();
        System.out.println("Introduce PIN: ");
        int PIN = scanner.nextInt();
        int dinero;
        //Me lié y no supe hacerlo


    }
}

