package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testReceberPedido() {

        Pedido pedido = new Pedido();

        assertEquals("Pedido recebido.", pedido.getNomeEstado());


        boolean resultado = pedido.preparar();


        assertTrue(resultado);
        assertEquals("Preparando o pedido.", pedido.getNomeEstado());
    }

    @Test
    public void testFinalizarPreparo() {

        Pedido pedido = new Pedido();
        pedido.preparar();


        assertEquals("Preparando o pedido.", pedido.getNomeEstado());


        boolean resultado = pedido.finalizarPreparo();


        assertTrue(resultado);
        assertEquals("Pedido pronto.", pedido.getNomeEstado());
    }

    @Test
    public void testCancelarPedido() {

        Pedido pedido = new Pedido();


        assertEquals("Pedido recebido.", pedido.getNomeEstado());


        boolean resultado = pedido.cancelar();


        assertTrue(resultado);
        assertEquals("Pedido cancelado.", pedido.getNomeEstado());
    }

    @Test
    public void testEntregarPedido() {

        Pedido pedido = new Pedido();
        pedido.preparar();
        pedido.finalizarPreparo();


        assertEquals("Pedido pronto.", pedido.getNomeEstado());


        boolean resultado = pedido.entregar();


        assertTrue(resultado);
        assertEquals("Pedido em entrega", pedido.getNomeEstado());
    }

    @Test
    public void testFinalizarEntrega() {

        Pedido pedido = new Pedido();
        pedido.preparar();
        pedido.finalizarPreparo();
        pedido.entregar();


        assertEquals("Pedido em entrega", pedido.getNomeEstado());


        boolean resultado = pedido.finalizarEntrega();


        assertTrue(resultado);
        assertEquals("Pedido entregue.", pedido.getNomeEstado());
    }

    @Test
    public void testCancelarRecebido() {

        Pedido pedido = new Pedido();


        assertEquals("Pedido recebido.", pedido.getNomeEstado());


        boolean resultado = pedido.cancelar();


        assertTrue(resultado);
        assertEquals("Pedido cancelado.", pedido.getNomeEstado());
    }

    @Test
    public void testCancelarPreparado() {

        Pedido pedido = new Pedido();
        pedido.preparar();
        pedido.finalizarPreparo();


        assertEquals("Pedido pronto.", pedido.getNomeEstado());


        boolean resultado = pedido.cancelar();


        assertTrue(resultado);
        assertEquals("Pedido cancelado.", pedido.getNomeEstado());
    }
}

