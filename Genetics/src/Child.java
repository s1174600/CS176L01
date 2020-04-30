import java.util.Random;
import java.util.Scanner;

public class Child {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random gene = new Random();
		
		boolean done = false;
		String name, childname, sex, pronoun, childEcolor, childHcolor, childheight, childvision, repeat = "x";
		int geneRandom = 0;
		
		String[] m = new String[5];
		String[] f = new String[5];
		String[] noval = new String[5];
		
		String[][] exp = {{"Brown", "Blue", "Green", "Grey"}, {"Brown", "Black", "Blonde", "Red"}, {"Male", "Female", "Female", "Male"}, {"6.5", "6.0", "5.5", "5.0"}, {"normal", "near", "far", "color"}};
		String[] com = {"DD", "RR", "DR", "RD"};
		String[] c = {"eye color", "hair", "sex", "height", "vision"};
		
		Mother mother = new Mother(c, exp, com);
		Father father = new Father();
		
		while (done == false) {
		System.out.println("Enter the father's name: ");
		name = in.nextLine();
		
		father.setName(name);
		
		System.out.println("Enter the mothers name: ");
		name = in.nextLine();
		mother.setName(name);
		
		for (int i = 0; i < f.length; i++) {
			geneRandom = gene.nextInt(100) + 1;
			if (geneRandom >= 50) {
				f[i] = "R";
			}
			
			else {
				f[i] = "D";
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			geneRandom = gene.nextInt(100) + 1;
			if (geneRandom >= 50) {
				m[i] = "R";
			}
			
			else {
				m[i] = "D";
			}
		}
		
		if((m[2] + f[2]).equals(com[0]) || (f[2] + f[2]).equals(com[3])) {
			sex = mother.expression[2][0];
			pronoun = "He";
		}
		
			else {
				sex = mother.expression[2][1];
				pronoun = "She";
			}
				
		System.out.println();
		System.out.print("The sex of the child is a " + sex + ". Please enter a name for the child: ");
		childname = in.nextLine();
		
		System.out.println();
		System.out.print(childname + " is the child of " + mother.getName() + " and " + father.getName() + ". ");
		if ((m[0] + f[0]).equals(com[0])) {
			childEcolor = mother.expression[0][0];
		}
		
			else if ((m[0] + f[0]).equals(com[1])) {
				childEcolor = mother.expression[0][1];
			}
			else if ((m[0] + f[0]).equals(com[2])) {
				childEcolor = mother.expression[0][2];
			}
			
			else {
				childEcolor = mother.expression[0][3];
			}
		
		System.out.print(pronoun + " was born with " + childEcolor + " " + mother.Characteristic[0] + ", ");
		
		if ((m[1] + f[1]).equals(com[0])) {
			childHcolor = mother.expression[1][0];
		}
		
			else if ((m[1] + f[1]).equals(com[1])) {
				childHcolor = mother.expression[1][1];
			}
			else if ((m[1] + f[1]).equals(com[2])) {
				childHcolor = mother.expression[1][2];
			}
		
			else {
				childHcolor = mother.expression[1][3];
			}
		
		System.out.print(childHcolor + " " + mother.Characteristic[1] + ", ");
		
		if ((m[3] + f[3]).equals(com[0])) {
			childheight = mother.expression[3][0];
		}
		
			else if ((m[3] + f[3]).equals(com[1])) {
				childheight = mother.expression[3][1];
			}
			else if ((m[3] + f[3]).equals(com[2])) {
				childheight = mother.expression[3][2];
			}
		
			else {
				childheight = mother.expression[3][3];
			}
		
		System.out.print("will grow to a " + mother.Characteristic[3] + " of " + childheight + ", ");
		
		if ((m[4] + f[4]).equals(com[0])) {
			childvision = mother.expression[4][0];
		}
		
			else if ((m[4] + f[4]).equals(com[1])) {
				childvision = mother.expression[4][1];
			}
			else if ((m[4] + f[4]).equals(com[2])) {
				childvision = mother.expression[4][2];
			}
		
			else {
				childvision = mother.expression[4][3];
			}
		
		System.out.print("and will have " + childvision + " " + mother.Characteristic[4] + ".");
		System.out.println();
		System.out.print("Would you like repeat the code? (yes or no): ");
		repeat = in.nextLine();
		
		if (repeat.equalsIgnoreCase("yes")) {
			done = false;
		}
		
			else if (repeat.equalsIgnoreCase("no")) {
				done = true;
			
				System.out.println();
				System.out.println("The simulation has ended");
			}
		
			else {
				System.out.print("Invalid input. Enter yes or no: ");
				repeat = in.nextLine();
				
				if (repeat.equalsIgnoreCase("yes")) {
					done = false;
				}
		
					else if (repeat.equalsIgnoreCase("no")) {
						done = true;
						
						System.out.println();
						System.out.println("The simulation has ended");
					}
			}
		}
			}
		}
