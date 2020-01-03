package abstractfactory.elf;

import abstractfactory.Army;

public class ElfArmy implements Army {

  static final String DESCRIPTION = "This is the Elven army!";
  
  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}