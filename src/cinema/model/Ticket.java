package cinema.model;

public class Ticket {
	private int id;
	private Hall hall;
	private Hour hour;
	private int row;
	private int col;
	
	public Ticket(Hall hall, Hour hour, int row, int col) {
		this.hall = hall;
		this.hour = hour;
		this.row = row;
		this.col = col;
	}
	public Ticket(int id, Hall hall, Hour hour, int row, int col) {
		this.id = id;
		this.hall = hall;
		this.hour = hour;
		this.row = row;
		this.col = col;
	}
	
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", hall=" + hall + ", hour=" + hour
				+ ", row=" + row + ", col=" + col + "]";
	}
}
