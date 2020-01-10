package combinator;

public class CombinatorApp {
	public static void main(String[] args) {
		var queriesOr = new String[]{"many", "Annabel"};
		var finder = Finders.expandedFinder(queriesOr);
		var res = finder.find(text());
		System.out.printf("expanded: %s\n", res);

		var queriesAnd = new String[]{"Annabel", "my"};
		finder = Finders.specializedFinder(queriesAnd);
		res = finder.find(text());
		System.out.printf("specialized: %s\n", res);

		res = Finders.filteredFinder(" was ", "many", "child").find(text());
		System.out.printf("filtered: %s\n", res);
	}

	private static String text() {
		return
						"It was many and many a year ago,\n"
										+ "In a kingdom by the sea,\n"
										+ "That a maiden there lived whom you may know\n"
										+ "By the name of ANNABEL LEE;\n"
										+ "And this maiden she lived with no other thought\n"
										+ "Than to love and be loved by me.\n"
										+ "I was a child and she was a child,\n"
										+ "In this kingdom by the sea;\n"
										+ "But we loved with a love that was more than love-\n"
										+ "I and my Annabel Lee;\n"
										+ "With a love that the winged seraphs of heaven\n"
										+ "Coveted her and me.";
	}
}
