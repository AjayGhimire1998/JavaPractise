package internetApplication;

import java.util.ArrayList;

/**
 * C-2.28 Write a set of Java classes that can simulate an Internet application
 * in which one party, Alice, is periodically creating a set of packets that she
 * wants to send to Bob. An Internet process is continually checking if Alice
 * has any packets to send, and if so, it delivers them to Bob’s computer; Bob
 * is periodically checking if his computer has a packet from Alice, and if so,
 * he reads and deletes it.
 * 
 * @author ajayghimire
 *
 */
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
