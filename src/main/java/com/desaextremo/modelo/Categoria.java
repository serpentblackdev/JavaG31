package com.desaextremo.modelo;

/**
 * Modela clase categoria
 * @author desaextremo
 */
public class Categoria {
    private int id;
    private String nombre;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    /**
     * Imprime el estado
     */
    public String toString() {
        return "Id: " + this.id + "\nNombre: " + this.nombre;
    }
}

