package org.example; 

public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean receber(Pedido Pedido) {
        return false;
    }

    public boolean preparar(Pedido Pedido) {
        return false;
    }

    public boolean cancelar(Pedido Pedido) {
        return false;
    }

    public boolean entregar(Pedido Pedido) {
        return false;
    }

    public boolean finalizarEntrega(Pedido Pedido) {
        return false;
    }

    public boolean finalizarPreparo(Pedido Pedido) {
        return false;
    }


}