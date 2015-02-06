public class Spreadsheet {
	int rows = 7;
	int columns = 10;
	Cell[][] sheet;
	String sheetString = "";

	public Spreadsheet(int r, int c) {
		this.sheet = new Cell[r + 1][c + 1];
		rows = r;
		columns = c;
		
		setPositions();	
		
		for 
	}
	
	public String printSheet() {
		tableLetters();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sheetString += sheet[i][j].toString();
				sheetString += "|";
			}
			sheetString += "\n";
			sheetString += "------------+------------+------------+------------+------------+------------+------------+------------+";
			sheetString += "\n";
		}
		return sheetString;
	}

	
	public void setCell(String cellName, String cellContents) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; i < columns; i++) {
				if (sheet[i][j].position.equals(cellName)) {
					sheet[i][j].setCell(cellContents);
				}
			}
		}
	}
	
	private void setPositions() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; i < columns; j++) {
				System.out.print(alphabet.charAt(i * j));
				sheet[i][j].setPosition(alphabet.charAt(i * j) + j + "hello");
			}
		}
	}
	
	// Takes each border cell and sets them to the border letters and numbers
	private void tableLetters() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 1; i < rows; i++) {
			sheet[i][0].setCell(i + ""); 
		}
		for (int i = 1; i < columns; i++) {
			sheet[0][i].setCell(alphabet.charAt(i - 1) + "");
		}
	}
	
}
