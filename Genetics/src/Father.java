
public class Father {
	public String[] fathergene;
	public String fatherfirstname;
	
	public Father() {
		fathergene = new String[5];
	}
	
	public void changeFather(String[] fg) {
		fathergene = fg;
	}
	public void setName(String Ffn) {
		fatherfirstname = Ffn;
	}
	
	public String getName() {
		return fatherfirstname;
	}
	}
