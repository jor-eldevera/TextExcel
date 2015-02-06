
public class Cell {
	String cellContents = "            ";
	String position;
	
	public Cell() {
		this.cellContents = "            ";
	}
	
	public void setCell(String input) {
		int inputLength = input.length();
		int spaceCount = 12 - inputLength;
		int leftSpaceCount = (spaceCount - inputLength) / 2;
		int rightSpaceCount = spaceCount - leftSpaceCount;
		
		cellContents = "";
		for (int i = 0; i < leftSpaceCount; i++) {
			cellContents += " ";
		}
		cellContents += input;
		for (int i = 0; i < rightSpaceCount; i++) { 
			cellContents += " ";
		}
	}
	
	public void setPosition(String pos) {
		position = pos;
	}
	
	public String toString() {
		return cellContents;
	}

}