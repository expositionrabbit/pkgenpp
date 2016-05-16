package pkgenpp;

public class Document {

	public String docName = null;
	public String meetingName = null;
	public String place = null;
	public String time = null;
	public List<String> signees = null;
	public List<Section> sections = null;
	
	private RawData data;

	public Document(RawData data) {
		this.data = data;
	}
	
	public void validate() {
	
	}
}
