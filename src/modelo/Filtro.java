/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {

    private int id,stock;
    private String codigo,marca;
    private boolean existencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }
    
    public Filtro(){
        
    }

    public Filtro(int id, String codigo, String marca,int stock, boolean existencia) {
        this.id = id;
        this.stock = stock;
        this.codigo = codigo;
        this.marca = marca;
        this.existencia = existencia;
    }

    public Filtro(String codigo, String marca,int stock, boolean existencia) {
        this.stock = stock;
        this.codigo = codigo;
        this.marca = marca;
        this.existencia = existencia;
    }

    public Filtro( String marca,int stock, boolean existencia) {
        this.stock = stock;
        this.marca = marca;
        this.existencia = existencia;
    }
}
