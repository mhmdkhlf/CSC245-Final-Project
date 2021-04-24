package BlackBoardClasses;

public class Assignment {
	private String title;
	private String instructions;
	
	public Assignment(String title, String instructions) {
		this.title = title;
		this.instructions = instructions;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String toString() {
		return "Title: "+title+"\n"+"Instructions: "+instructions;
	}
}
