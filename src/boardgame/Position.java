package boardgame;

public class Position {

	//Variaveis privadas
	private int row;
	private int column;
	
	//construtor padr�o
	public Position(int row, int column) {
		
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public String toString() {
		return row + "," + column;
	}
}
