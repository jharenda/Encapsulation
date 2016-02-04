
package lab1;

/**
 * Prior to looking at the solution, I wasn't quite sure how I wanted to handle the name and SS number for an employee object.
    Based on the solution, I agree that we don't want to setup a new employee without having a name and SS number, so I 
   followed the example of requiring those parameters for this method.
   
    orientEmployee (used in solution) is definitely a better name than the one I choose here, but I also don't think my choice 
    is terrible
  
 * @author Jennifer
 */
public class HRManager {
    // this is in the solution, yet as it works w/o it, I need to figure out what the point of having it is. 
    // duh- I would want to actually store all these employees that I make. Probabably in an array ( arrayList). 
    // also needed if I want to get the status of an employee in the method below
   private Employee employee;
   
   
    public void trainEmployee(String firstName, String lastName, String ssn) { 
        Employee newEmployee = new Employee();
        newEmployee.setFirstName(firstName);
        newEmployee.setLastName(lastName);
        newEmployee.setSsn(ssn);
        // requires cubeId number
        newEmployee.hireEmployee("108");
       
    }
    
    // not sure if I would have thought to include this method here on my own, but I agree that 
    // we would only do that through HR,so it should be here. 
    public String getEmployeeStatus() {
        return employee.getStatus();
    }
}