package visitor.my;

public class AnotherFileVisitor extends Visitor<File>{
	@Override
	protected boolean accept(Object obj) {
		return obj instanceof File;
	}

	@Override
	protected void doVisit(File file) {
		System.out.println("current file: " + file.hashCode());
	}
}
