public class Spreadsheet {
	private int rows = 7;
	private int columns = 10;
	Cell[][] sheet;
	private String sheetString = "";

	// Constructor takes the rows and columns
	public Spreadsheet(int r, int c) {
		this.sheet = new Cell[r + 1][c + 1];
		rows = r;
		columns = c;
		
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= columns; j++) {
				this.sheet[i][j] = new Cell();
			}
		}
		setPositions();	
	}
	
	public String sheet() {
		tableLetters();
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= columns; j++) {
				sheetString += sheet[i][j].toString();
				sheetString += "|";
			}
			
			sheetString += "\n";
			for (int j = 0; j <= columns; j++) {
				sheetString += "------------+";
			}
			sheetString += "\n";
		}
		return sheetString;
	}

	
	public void setCell(String cellName, String cellContents) {
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= columns; j++) {
//				System.out.println(cellName + " " + sheet[i][j].getPosition());
				if (sheet[i][j].getPosition().equals(cellName)) {
					sheet[i][j].setCell(cellContents);
				}
			}
		}
	}
	
	private void setPositions() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(i + " " + j);
				this.sheet[i][j].setPosition("" + alphabet.charAt(i) + j);
			}
		}
	}
	
	// Takes each border cell and sets them to the border letters and numbers
	private void tableLetters() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 1; i <= rows; i++) {
			sheet[i][0].setCell(i + ""); 
			sheet[i][0].setPosition("border");
		}
		for (int i = 1; i <= columns; i++) {
			sheet[0][i].setCell(alphabet.charAt(i - 1) + "");
			sheet[0][i].setPosition("border");
		}
	}
	
}
