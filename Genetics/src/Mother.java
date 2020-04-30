
public class Mother extends FamilyExpressions {
	public String[] mothergene;
	public String motherfirstname;
	
	public Mother(String[] c, String[][] exp, String[] com) {
		super(c, exp, com);
		mothergene = new String[5];
	}
	
	public void changeMother(String[] m) {
		mothergene = m;
	}
	public void setName(String mfn) {
		motherfirstname = mfn;
	}
	
	public String getName() {
		return motherfirstname;
	}
	}
