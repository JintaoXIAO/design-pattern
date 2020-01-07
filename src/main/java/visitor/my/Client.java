package visitor.my;

public class Client {
	public static void main(String[] args) {
		var component = new Folder(
						new File(),
						new Folder(
										new File(), new Folder(
										new File(), new Folder( new File(), new Folder()))
						),
						new File(),
						new File()
		);

		component.accept(new FileVisitor(), new FolderVisitor(), new AnotherFileVisitor());
	}
}
