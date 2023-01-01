package dynamicDispatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader blogReader = null;
		while (blogReader == null) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the blog from where yoy want to read \n "
					+ "1: Mashable\n 2: TechCruch\n 3: LifeHacker\n 4: Digit\n 5: PCWorld\n ");
			int choice = Integer.parseInt(reader.readLine());

			switch (choice) {
			case 1:
				blogReader = new MashableReader();
				break;
			case 2:
				blogReader = new TechCruchReader();
				break;
			case 3:
				blogReader = new LifeHackerReader();
				break;
			case 4:
				blogReader = new DigitReader();
				break;
			case 5:
				blogReader = new PCWorldReader();
				break;
			default:
				System.out.println("Please enter a valid number");
				blogReader = null;

				break;
			}
		}

		if (blogReader != null) {
			blogReader.readFromBlog();
		}
	}

}

class Reader {
	public void readFromBlog() {
		System.out.println("Reading from any blog");
	}
}

class MashableReader extends Reader {
	public void readFromBlog() {
		System.out.println("Reading from Mashable");
	}
}

class TechCruchReader extends Reader {
	public void readFromBlog() {
		System.out.println("Reading from TechCrunch");
	}
}

class LifeHackerReader extends Reader {
	public void readFromBlog() {
		System.out.println("Reading from LifeHacker");
	}
}

class DigitReader extends Reader {
	public void readFromBlog() {
		System.out.println("Reading from Digit");
	}
}

class PCWorldReader extends Reader {
	public void readFromBlog() {
		System.out.println("Reading from PCWorldReader");
	}
}