package visitor.my;

public class FileVisitor implements Visitor<File>{
	@Override
	public boolean accept(Object obj) {
		return obj instanceof File;
	}

	@Override
	public void doVisit(File file) {
		System.out.println(file);
	}
}
