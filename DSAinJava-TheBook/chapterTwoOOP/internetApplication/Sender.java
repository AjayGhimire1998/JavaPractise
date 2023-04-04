package internetApplication;

import java.util.ArrayList;
import java.util.Random;

public class Sender {
	private ArrayList<Packet> packets;
	private int nextId;

	Sender() {
		packets = new ArrayList<>();
		nextId = 1;
	}

	public void createPackets() {
		Random random = new Random();
		int numOfPackets = random.nextInt(5) + 1;

		for (int i = 0; i < numOfPackets; i++) {
			String data = "Packet data #" + nextId;
			Packet packet = new Packet(nextId, data);
			packets.add(packet);
			nextId++;
		}
	}

	public ArrayList<Packet> getPackets() {
		ArrayList<Packet> result = new ArrayList<>(packets);
		packets.clear();
		return result;
	}
}
