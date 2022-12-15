package FIleClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// file: an abstract representation of file and directory pathnames.

//		File file = new File("secret_message.txt");
//
//		if (file.exists()) {
//			System.out.println("it exists. :o  ");
//			System.out.println(file.getPath());
//			System.out.println(file.getAbsolutePath());
//			System.out.println(file.isFile());
//			file.delete();
//		} else {
//			System.out.println("it doesn't exists.  :(");
//		}

		// WriteFile

//		try {
//			FileWriter writer = new FileWriter("poem.txt");
//			writer.write("Roses are red \nViolets are blue \nI am a Java developer \nWho are you ?");
//			writer.append("\n(poem by me)");
//			writer.close();
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		// FileReader: read the contents of a file as a stream of characters, one by
		// one;
		// read() returns an int value which contains the byte value;
		// when read() returns -1, it means ther is no more data to be read;

		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();

			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
//				System.out.println("Data " + data);
			}
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
