
public class Cell {
	private String cellContents = "            ";
	private String position;
	
	public Cell() {
		this.cellContents = "            ";
	}
	
	public void setCell(String input) {
		int inputLength = input.length();
		int spaceCount = 12 - inputLength;
		int leftSpaceCount = spaceCount / 2;
		int rightSpaceCount = spaceCount - leftSpaceCount;
		
		this.cellContents = "";
		for (int i = 0; i < leftSpaceCount; i++) {
			this.cellContents += " ";
		}
		this.cellContents += input;
		for (int i = 0; i < rightSpaceCount; i++) { 
			this.cellContents += " ";
		}
	}
	
	public void setPosition(String pos) {
		this.position = pos;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String toString() {
		return cellContents;
	}

}
