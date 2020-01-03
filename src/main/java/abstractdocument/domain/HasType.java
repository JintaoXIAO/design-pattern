package abstractdocument.domain;

import java.util.Optional;

import abstractdocument.Document;

public interface HasType extends Document{
  default Optional<String> getType() {
    return Optional.ofNullable((String) get(Property.TYPE.name()));
  }
}
