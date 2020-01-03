package abstractfactory.orc;

import abstractfactory.Castle;

public class OrcCastle implements Castle {
  static final String DESCRIPTION = "This is the Orc castle";
  
  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
