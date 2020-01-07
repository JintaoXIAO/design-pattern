package visitor.my;

public class FileVisitor extends Visitor<File>{
	@Override
	protected boolean accept(Object obj) {
		return obj instanceof File;
	}

	@Override
	public void doVisit(File file) {
		System.out.println(file);
	}
}
