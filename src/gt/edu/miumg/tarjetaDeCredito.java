package gt.edu.miumg;

public class tarjetaDeCredito implements pago {
    private String numero;
    private String fecha;
    private String cvv;

    public tarjetaDeCredito(String numero, String fecha, String cvv) {
        this.numero = numero;
        this.fecha = fecha;
        this.cvv = cvv;
    }

    @Override
    public boolean validar() {
        return false;
    }

    @Override
    public void proceso() {

    }
}
