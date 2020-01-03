package abstractdocument.domain;

import java.util.Map;

import abstractdocument.AbstractDocument;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts{
  public Car(Map<String, Object> properties) {
    super(properties);
  }
}
