package org.example;

public class PedidoEstadoReceber extends PedidoEstado {

    private PedidoEstadoReceber() {};
    private static PedidoEstadoReceber instance = new PedidoEstadoReceber();
    public static PedidoEstadoReceber getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido feito.";
    }


}
