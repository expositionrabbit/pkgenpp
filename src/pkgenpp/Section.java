package pkgenpp;

public class Section {

	public int number;
	public Section parent;
	public String title = null, content = null;

	public Section(Section parent, int number) {
		this.parent = parent;
		this.number = number;
	}
	
	public Section(Section parent, int number, String title, String content) {
		this.parent = parent;
		this.number = number;
		this.title = title;
		this.content = content;
	}
	
	public String getNumberString() {
		if(parent == null) { return "" + number; }
		return parent.getNumberString() + "." + number;
	}
	
	@Override
	public String toString() {
		String numbers = getNumberString();
		
		if(title == null) {
			if(content != null) {
				return numbers + " " + content;
			}
		} else {
			String string = numbers + " [" + title + "]";
			
			if(content != null) {
				string += "\n" + content;
			}
			
			return string;
		}
		
		return numbers;
	}
}
