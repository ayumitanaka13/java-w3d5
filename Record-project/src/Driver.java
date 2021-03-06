import java.util.Scanner;

public class Driver {
	
	// method to print just one object which pass as an argument
	public static void printRecordInformation(Record tempRecord) {
		System.out.println("ID : " + tempRecord.getId() +
			"\nTITLE : " + tempRecord.getRecordTitle() +
			"\nSINGER : " + tempRecord.getSingerName() +
			"\nLENGTH : " + tempRecord.getRecordLength() +
			"\nRANK : " + tempRecord.getRecordRanking());
	}
	
	// method to iterate through the array and find the index for the title
	/*
	 * @return the index of record if we do not have it --> return -1
	 */
	public static int findIndexOfRecord(Record[] records, String title) {
		for (int i = 0; i < records.length; i++) {
			if(records[i].getRecordTitle().equalsIgnoreCase(title)) {
				return i;
			}
		}
		return -1;
	}
	
	// getAverage of lengthRecord -> return average
	public static double getAverageOfLengthRecord(Record[] records) {
		double sum = 0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getRecordLength();
		}
		return sum / records.length;
	}
	
	// getAverage of ranking  -> return average
	public static double getAverageOfRanking(Record[] records) {
		double sum = 0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getRecordRanking();
		}
		return sum / records.length;
	}
	

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		// at least create 5 objects
		Record r1 = new Record("", "", 120.5, 1);
		Record r2 = new Record("Sound of music", "John Doe", 280.0, 2);
		Record r3 = new Record("ABC", "Ayumi Tanaka", 60.0, 5);
		Record r4 = new Record("Baby Shark", "Canadian kids", 165.0, 3);
		Record r5 = new Record("Hey Jude", "The Beatles", 365.0, 4);
		
		// create array and add these objects to array
		
		Record[] records = new Record[5];
		records[0] = r1;
		records[1] = r2;
		records[2] = r3;
		records[3] = r4;
		records[4] = r5;
		
		// ask the user to enter the title of record
		System.out.println("Please enter the title of record");

		// read the input
		String titleName = input.nextLine();
		// find record
		int index = findIndexOfRecord(records, titleName);
		
		if (index == -1) {
			System.err.println("We do not have " + titleName);
		} else {
			System.out.println("Index is " + index);
		}	

		// print the record
		printRecordInformation(r1);
		
		// print the averages
		System.out.println("The average of length is " + getAverageOfLengthRecord(records));
		System.out.println("The average of length is " + getAverageOfRanking(records));
	}

}
