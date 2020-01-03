package abstractdocument;

import java.util.List;
import java.util.Map;

import abstractdocument.domain.Car;

import static abstractdocument.domain.Property.*;

public class Client {
  
  public Client() {
    Map<String, Object> wheelProperties = Map.of(
           TYPE.name(), "wheel",
           MODEL.name(), "15C",
           PRICE.name(), 100L
        );
    Map<String, Object> doorProperties = Map.of(
          TYPE.name(), "door",
          MODEL.name(), "Lambo",
          PRICE.name(), 300L
        );
    
    Map<String, Object> carProperties = Map.of(
          MODEL.name(), "300SL",
          PRICE.name(), 10000L,
          PARTS.name(), List.of(wheelProperties, doorProperties)
        );
    
    Car car = new Car(carProperties);
    
    car.getParts().forEach(p -> {
      System.out.printf("\t%s/%s/%s/\n",p.getType().orElse(null),
      p.getModel().orElse(null),
      p.getPrice().orElse(null));
      
    });
  }
  
  
  public static void main(String[] args) {
    new Client();
  }
}
