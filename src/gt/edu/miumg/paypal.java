package gt.edu.miumg;

import java.io.Serializable;

public class paypal implements pago {
    private String email;
    private int codigo;

    public paypal(String email, int codigo) {
        this.email = email;
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
