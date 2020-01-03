package abstractdocument.domain;

import java.util.stream.Stream;

import abstractdocument.Document;

public interface HasParts extends Document{
  default Stream<Part> getParts() {
    return children(Property.PARTS.name(), Part::new);
  }
}
