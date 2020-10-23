
public class Record {
	// id --> random number from 100 to 10000
	private int id;
	// recordTitle --> Null or empty
	private String recordTitle;
	// singerName --> Null or empty
	private String singerName;
	// recordLength --> more than zero
	private double recordLength;
	// recordRanking --> more than zero less than six
	private int recordRanking;
			
	// constructor
	public Record(String recordTitle, String singerName, double recordLength, int recordRanking) {
		setId();
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
	}
	

	// getters
	
	/*
	 *  @return id
	 */
	public int getId() {
		return id;
	}
	/*
	 *  @return recordTitle
	 */
	public String getRecordTitle() {
		return recordTitle;
	}
	/*
	 *  @return singerName
	 */
	public String getSingerName() {
		return singerName;
	}
	/*
	 *  @return recordLength
	 */
	public double getRecordLength() {
		return recordLength;
	}
	/*
	 *  @return recordRanking
	 */
	public int getRecordRanking() {
		return recordRanking;
	}
	
	// setters

	/*
	 *  @param id
	 */
	public void setId() {
		int randomNumber = (int)(Math.random()*(9901)+100);
		this.id = randomNumber;
	}
	/*
	 *  @param recordTitle
	 */
	public void setRecordTitle(String recordTitle) {
		if(!recordTitle.isEmpty() || !recordTitle.equalsIgnoreCase(null)) {
			this.recordTitle = recordTitle;
		}
	}
	/*
	 *  @param singerName
	 */
	public void setSingerName(String singerName) {
		if(!singerName.isEmpty() || !singerName.equalsIgnoreCase(null)) {
			this.singerName = singerName;
		}
	}
	/*
	 *  @param recordLength
	 */
	public void setRecordLength(double recordLength) {
		if(recordLength > 0) {
			this.recordLength = recordLength;
		}
	}
	/*
	 *  @param recordRanking
	 */
	public void setRecordRanking(int recordRanking) {
		if(recordRanking > 0 && recordRanking < 7) {
			this.recordRanking = recordRanking;
		}
	}

}
