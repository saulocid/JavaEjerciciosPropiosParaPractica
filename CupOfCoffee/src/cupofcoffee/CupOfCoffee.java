package cupofcoffee;

import Entities.Coffee;
import Services.CoffeeService;

public class CupOfCoffee {
  
  public static void main(String[] args) {
    
    CoffeeService cs = new CoffeeService();
    Coffee cafe = cs.start();
    
    while (cafe.getJarro()!=0){
      cs.refill(cafe);
    }
        
  }
  
}
