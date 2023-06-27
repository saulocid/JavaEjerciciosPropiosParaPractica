package Services;

import Entities.Coffee;
import java.util.Scanner;

public class CoffeeService {

  public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

  public Coffee start() {

    Coffee cafe = new Coffee();
    System.out.print("Elija la marca de café:  ");
    System.out.println("1- Nescafé. 2-  La Virginia. 3- Carrefour. 4- Cabrales. 5- Lavazza.  6- Starbucks");

    double num;
    do {
      num = leer.nextDouble();
      if (num < 1 || num > 5 || num != Math.round(num)) {
        System.out.print("Opción errónea, vuelva a ingresar: ");
      }
    } while (num < 1 || num > 6 || num != Math.round(num));

    switch ((int) num) {
      case 1:
        cafe.setMarca("Nescafé");
        break;
      case 2:
        cafe.setMarca("La Virginia");
        break;
      case 3:
        cafe.setMarca("Carrefour");
        break;
      case 4:
        cafe.setMarca("Cabrales");
        break;
      case 5:
        cafe.setMarca("Lavazza");
        break;
      default:
        cafe.setMarca("Starbucks");
    }

    System.out.print("ingrese la capacidad de su jarro en cc, como mínimo 500cc: ");
    do {
      num = leer.nextDouble();
      if (num < 500) {
        System.out.print("Opción errónea, vuelva a ingresar: ");
      }
    } while (num < 500);
    cafe.setJarro(num);

    return new Coffee();
  }
  
  public void refill(Coffee cafe){
    cafe.setJarro(cafe.getCapacidad());
  }

}
