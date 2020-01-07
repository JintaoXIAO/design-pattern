package visitor.my;

public class FolderVisitor implements Visitor<Folder>{
	@Override
	public boolean accept(Object obj) {
		return obj instanceof Folder;
	}

	@Override
	public void doVisit(Folder folder) {
		System.out.println(folder);
	}
}
