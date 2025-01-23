package org.example; 

public class Pedido {

    private String descricao;
    private String iten;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIten(String iten) {
        this.descricao = iten;
    }

    public String getIten() {
        return iten;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
