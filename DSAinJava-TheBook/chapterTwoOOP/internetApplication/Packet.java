package internetApplication;

public class Packet {
	private int id;
	private String data;

	Packet(int id, String data) {
		this.id = id;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}
}
