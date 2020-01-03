package abstractfactory.elf;

import abstractfactory.Army;
import abstractfactory.Castle;
import abstractfactory.King;
import abstractfactory.KingdomFactory;

public class ElfKindomFactory implements KingdomFactory{

  @Override
  public Castle createCastle() {
    return new ElfCastle();
  }

  @Override
  public King createKing() {
    return new ElfKing();
  }

  @Override
  public Army createArmy() {
    return new ElfArmy();
  }

}
