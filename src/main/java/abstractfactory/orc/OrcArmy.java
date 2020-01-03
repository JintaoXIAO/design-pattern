package abstractfactory.orc;

import abstractfactory.Army;

public class OrcArmy implements Army {

  static final String DESCRIPTION = "This is the Orc army!";
  
  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
