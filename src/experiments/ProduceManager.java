
package experiments;

/**
 *
 * @author Jennifer
 */
public class ProduceManager {
    private Fruit fruit; 
    
    public void newFruit(String name, String color, String price){
       Fruit fruit = new Fruit();
       fruit.manageFruit(name, color, price);
       
    }
   
}
