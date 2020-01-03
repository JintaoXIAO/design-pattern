package abstractdocument.domain;

import java.util.Map;

import abstractdocument.AbstractDocument;

public class Part extends AbstractDocument implements HasType, HasModel, HasPrice{

  protected Part(Map<String, Object> properties) {
    super(properties);
  }
  
}
