package org.example; 

public class Pedido {

    private String descricao;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoRecebido.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public boolean receber() {
        return estado.receber(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean finalizarEntrega() {
        return estado.finalizarEntrega(this);
    }

    public boolean finalizarPreparo() {
        return estado.finalizarPreparo(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return descricao;
    }

    public void setNome(String descricao) {
        this.descricao = descricao;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
