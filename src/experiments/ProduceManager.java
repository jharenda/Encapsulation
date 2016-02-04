package experiments;

/**
 *
 * @author Jennifer
 */
public class ProduceManager {

    private Fruit fruit = new Fruit();
//Fruit fruit = new Fruit();
    public ProduceManager(String idNumber) {
        if (idNumber.equals("123")) {
            newFruit();
        }
    }

    // calls Fruit Constructor, automatically calls the private manage fruit method which sets the parameters 
    public void  newFruit() {
        
        fruit.manageFruit("apple", "red", "$1.22", 4);
//        fruitList[1].manageFruit("kiwi", "green", "$2.62", 7);
//        fruitList[2].manageFruit("banana", "yellow", ".22", 11);
        
    }
     public String getInfo(){
         return ( fruit.getName() + " " +  fruit.getColor() + " "  + fruit.getPrice() + " " +  fruit.getQuantity());
    }

    // put stock and order here because I shouldn't need to interact with the fruit to stock/order.
    /// imagine an additional class which tells the ProduceManager to stock, then the produce Manager stocking the fruit.
    //? I think it works? Admittidly need to think it through again later to be sure. 
    public Boolean order() {
        System.out.println(fruit.getQuantity());
        if (fruit.getQuantity() < 5 || !fruit.isInStock()) {
            fruit.setInStock(false);
            fruit.setIsOrdered(true);
        }
        return fruit.isOrdered();
    }

    public Boolean stock() {
        fruit.stock();
        fruit.setInStock(true);
    
return fruit.isInStock(); 
    } 
}
