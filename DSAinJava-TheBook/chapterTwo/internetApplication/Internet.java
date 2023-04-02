package internetApplication;

import java.util.ArrayList;

public class Internet {
	private Sender sender;
	private Receiver receiver;

	Internet(Sender sen, Receiver rec) {
		sender = sen;
		receiver = rec;
	}

	public void run() {
		while (true) {
			sender.createPackets();
			ArrayList<Packet> packets = sender.getPackets();

			for (Packet packet : packets) {
				receiver.receivePacket(packet);
			}

			ArrayList<Packet> receivedPackets = receiver.getPackets();

			for (Packet packet : receivedPackets) {
				System.out.println("Received packet with ID " + packet.getId() + ": " + packet.getData());
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Sender sender = new Sender();
		Receiver receiver = new Receiver();
		Internet internet = new Internet(sender, receiver);
		internet.run();
	}
}
