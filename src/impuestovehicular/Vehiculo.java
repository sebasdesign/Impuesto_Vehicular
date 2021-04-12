/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestovehicular;

/**
 *
 * @author WIND 10
 */
public class Vehiculo {
    
    String marca,linea, modelo, valorComercial;
  

    public Vehiculo() {
        
    }
      
    public Vehiculo(String marca, String linea, String modelo, String valorComercial) {
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.valorComercial = valorComercial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    public String getValorComercial() {
        return valorComercial;
    }
    
    public void setValorComercial(String valorComercial) {
        this.valorComercial = valorComercial;
    }
}
