
public class TarjetaDebito extends Tarjeta {
    private Integer SaldoDisponible;



    public TarjetaDebito() {

    }

    public TarjetaDebito(String NIF, Integer PIN, String nombre, String apellido, Integer SaldoDisponible) {
        super(NIF, PIN, nombre, apellido);
        this.SaldoDisponible = SaldoDisponible;
    }

    public Integer getSaldoDisponible() {
        return SaldoDisponible;
    }

    public void setAvailableBalance(Integer SaldoDisponible) {
        this.SaldoDisponible = SaldoDisponible;
    }



    @Override
    public void mostrarTarjeta() {
        System.out.println("------------Información del Cliente----------");
        System.out.println("Name-> " + this.getNombre());
        System.out.println("Surname-> " + this.getApellido());
        System.out.println("NIF-> " + this.getNIF());
        System.out.println("Available Balance-> " + this.SaldoDisponible() + " €");
        System.out.println("----------------------------------------------");
    }
}