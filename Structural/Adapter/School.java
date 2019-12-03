package Adapter;

public class School {

	public static void main(String[] args) {

		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(p);
		aw.writeAssignment("I am bit tired to write an assignement");
	}
}
