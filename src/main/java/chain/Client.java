package chain;

public class Client {
	public static void main(String[] args) {
		var king = new OrcKing();
		king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
	}
}
