package edu.pingpong.bbdd;

public class InventarioBBDD implements Inventario{

    @Override
    public int numeroProductos(String tienda, String producto) {
        return BBDD.stocs.get(tienda).get(producto);
    }
}
