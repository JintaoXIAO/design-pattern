package visitor;

public class SergeantVisitor implements UnitVisitor{

  @Override
  public void visitSoldier(Soldier soldier) {
  }

  @Override
  public void visitSergeant(Sergeant sergeant) {
    System.out.printf("Good to see you %s\n", sergeant);
  }

  @Override
  public void visitCommander(Commander commander) {
  }

}
