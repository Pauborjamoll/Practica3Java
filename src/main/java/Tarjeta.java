public abstract class Tarjeta {
    private String NIF;
    private Integer PIN;
    private String nombre;
    private String apellido;
    private boolean Activa;

    public Tarjeta() {
    }

    public Tarjeta(String NIF, Integer PIN, String nombre, String apellido) {
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Activa = true;
    }

    public Tarjeta(Tarjeta copyCard) {
        setNIF(copyCard.getNIF());
        setPIN(copyCard.getPIN());
        setNombre(copyCard.getNombre());
        setApellido(copyCard.getApellido());
        setActiva(copyCard.Activa());
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Integer getPIN() {
        return PIN;
    }

    public void setPIN(Integer PIN) {
        this.PIN = PIN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean Activa() {
        return Activa;
    }

    public void setActiva(boolean activa) {
        Activa = activa;
    }
    //Metodo

    public void mostrarTarjeta() {
        System.out.println("------Información del cliente--------");
        System.out.println("Name-> " + this.nombre);
        System.out.println("Surname-> " + this.apellido);
        System.out.println("NIF-> " + this.NIF);
        System.out.println("--------------------------------------");
    }
}