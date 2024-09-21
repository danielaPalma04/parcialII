package gt.edu.miumg;

import java.io.Serializable;

public class cripto implements pago {
    private int codigo;
    private int monto;

    public cripto(int codigo, int monto) {
        this.codigo = codigo;
        this.monto = monto;
    }

    @Override
    public boolean validar() {
        return false;
    }

    @Override
    public void proceso() {

    }
}
