
class FamilyExpressions extends Characteristics {
	public String[][] expression;
	public String[] combination;
	
	public FamilyExpressions(String[] c, String[][] exp, String[] com) {
		super(c);
	
	expression = new String[5][4];
	expression = exp;
	
	combination = new String[4];
	combination = com;
	}
	}
