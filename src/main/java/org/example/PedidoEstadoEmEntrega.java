package org.example;

public class PedidoEstadoEmEntrega extends PedidoEstado {

    private PedidoEstadoEmEntrega() {};
    private static PedidoEstadoEmEntrega instance = new PedidoEstadoEmEntrega();
    public static PedidoEstadoEmEntrega getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido em entrega";
    }

    public boolean finalizarEntrega(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }
}
