package abstractfactory.orc;

import abstractfactory.Army;
import abstractfactory.Castle;
import abstractfactory.King;
import abstractfactory.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory{

  @Override
  public Castle createCastle() {
    return new OrcCastle();
  }

  @Override
  public King createKing() {
    return new OrcKing();
  }

  @Override
  public Army createArmy() {
    return new OrcArmy();
  }

}
