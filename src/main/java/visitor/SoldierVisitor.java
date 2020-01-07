package visitor;

public class SoldierVisitor implements UnitVisitor{

  @Override
  public void visitSoldier(Soldier soldier) {
    System.out.printf("Good to see you %s\n", soldier);
  }

  @Override
  public void visitSergeant(Sergeant sergeant) {
  }

  @Override
  public void visitCommander(Commander commander) {
  }

}
