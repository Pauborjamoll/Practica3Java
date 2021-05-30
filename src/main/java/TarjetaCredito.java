public class TarjetaCredito extends Tarjeta {
    private Integer SaldoDinsponible;
    private Integer CreditoDisponible;

    public TarjetaCredito() {

    }

    public TarjetaCredito(String NIF, Integer PIN, String nombre, String apellido, Integer SaldoDisponible, Integer CreditoDisponible) {
        super(NIF, PIN, nombre, apellido);
        this.SaldoDinsponible = SaldoDisponible;
        this.SaldoDinsponible = CreditoDisponible;
    }

    public TarjetaCredito(TarjetaCredito copyCard) {
        super(copyCard);
        this.SaldoDinsponible = copyCard.SaldoDinsponible;
        this.CreditoDisponible = copyCard.CreditoDisponible;
    }

    //Setters y getters

    public Integer getSaldoDinsponible() {
        return SaldoDinsponible;
    }

    public void setSaldoDinsponible(Integer SaldoDisponible) {
        this.SaldoDinsponible = SaldoDisponible;
    }

    public Integer getCreditoDisponible() {
        return CreditoDisponible;
    }

    public void setCreditoDisponible(Integer CreditoDisponible) {
        this.CreditoDisponible = CreditoDisponible;
    }

    @Override
    public void mostrarTarjeta() {
        System.out.println("------Información del cliente--------");
        System.out.println("Name-> " + this.getNombre());
        System.out.println("Surname-> " + this.getApellido());
        System.out.println("NIF-> " + this.getNIF());
        System.out.println("Credito Disponible-> " + this.getCreditoDisponible() + " €");
        System.out.println("Saldo Disponible-> " + this.getSaldoDinsponible() + " €");
        System.out.println("----------------------------------------");

    }
}