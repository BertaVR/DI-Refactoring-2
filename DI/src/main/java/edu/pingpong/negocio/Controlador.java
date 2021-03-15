package edu.pingpong.negocio;

import edu.pingpong.bbdd.InventarioBBDD;

public interface Controlador {
    public boolean necesitaReponer (String tienda, String producto);
}
