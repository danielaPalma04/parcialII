package gt.edu.miumg;

public class trnasferencia implements pago {
    private int numeroDeCuenta;
    private int codigo;

    public trnasferencia(int numeroDeCuenta, int codigo, String nombre) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.codigo = codigo;
    }
    @Override
    public boolean validar() {
        return false;
    }

    @Override
    public void proceso() {

    }
}
