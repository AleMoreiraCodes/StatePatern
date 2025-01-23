package org.example;

public class PedidoEstadoPreparar extends PedidoEstado {

    private PedidoEstadoPreparar() {};
    private static PedidoEstadoPreparar instance = new PedidoEstadoPreparar();
    public static PedidoEstadoPreparar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando o pedido.";
    }

}
