package org.example;

public class PedidoEstadoPreparado extends PedidoEstado {

    private PedidoEstadoPreparado() {};
    private static PedidoEstadoPreparado instance = new PedidoEstadoPreparado();
    public static PedidoEstadoPreparado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando o pedido.";
    }

}
