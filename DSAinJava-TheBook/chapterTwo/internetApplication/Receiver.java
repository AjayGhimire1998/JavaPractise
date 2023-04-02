package internetApplication;

import java.util.ArrayList;

public class Receiver {
	private ArrayList<Packet> packets;

	Receiver() {
		packets = new ArrayList<>();
	}

	public void receivePacket(Packet packet) {
		packets.add(packet);
	}

	public ArrayList<Packet> getPackets() {
		ArrayList<Packet> result = new ArrayList<>(packets);
		packets.clear();
		return result;
	}
}
