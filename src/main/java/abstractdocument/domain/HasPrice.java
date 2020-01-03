package abstractdocument.domain;

import java.util.Optional;


import abstractdocument.Document;

public interface HasPrice extends Document{
  default Optional<Number> getPrice() {
    return Optional.ofNullable((Number) get(Property.PRICE.name()));
  }
}
