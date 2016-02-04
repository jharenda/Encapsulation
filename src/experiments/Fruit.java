/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 * // In adherence with Encapsulation principles, all properties are marked private. 
 * In order to manage my fruit produce, certain things need to happen before others.
 * For example, I need to know the fruit's name before I can set it's color, etc. 
 * As such, I have provided a public method which executes the ordered (marked private) methods
 * in a specific order. 
 * @author Jennifer
 */
public class Fruit {
    private String name;
    private String color; 
    private String price;
    
    private boolean inStock;
    private boolean isOrdered;
    private double weight; 
    private int quantity; 
    
    // this is the main public method I am using to manage my fruit. Not happy about the method name, need to work on that. 
    // Maybe it's difficult to name because my example is slightly convuluted. 
    public void manageFruit(String name, String color, String price){
        setName(name);  
        setColor(color); 
        setPrice(price); 
       
    }
// public incase we want to get it? Mulling over this
    public String getName() {
        return name;
    }
//want to control access- only want to set the name from the manager
    private void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public boolean isIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
