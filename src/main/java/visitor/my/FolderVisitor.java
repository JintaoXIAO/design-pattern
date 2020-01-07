package visitor.my;

public class FolderVisitor extends Visitor<Folder>{
	@Override
	protected boolean accept(Object obj) {
		return obj instanceof Folder;
	}

	@Override
	public void doVisit(Folder folder) {
		System.out.println(folder);
	}
}
