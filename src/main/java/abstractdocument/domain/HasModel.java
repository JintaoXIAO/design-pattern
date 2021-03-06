package abstractdocument.domain;

import java.util.Optional;

import abstractdocument.Document;

public interface HasModel extends Document{
  default Optional<String> getModel() {
    return Optional.ofNullable((String) get(Property.MODEL.name()));
  }
}
