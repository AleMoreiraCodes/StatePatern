package org.example;

public class PedidoEstadoEmPreparo extends PedidoEstado {

    private PedidoEstadoEmPreparo() {};
    private static PedidoEstadoEmPreparo instance = new PedidoEstadoEmPreparo();
    public static PedidoEstadoEmPreparo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando o pedido.";
    }

    public boolean finalizarPreparo(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        return true;
    }

}
