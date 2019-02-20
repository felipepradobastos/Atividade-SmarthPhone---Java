/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthphone;

/**
 *
 * @author aluno
 */
public class model {
    private float price;
    private String model;
    private String marca;
    private int gigas;
    
    //Get e Sets

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the gigas
     */
    public int getGigas() {
        return gigas;
    }

    /**
     * @param gigas the gigas to set
     */
    public void setGigas(int gigas) {
        this.gigas = gigas;
    }
    
}
