
import java.util.Random;
public class Tester {

public static void main(String[] args) {
int sections = 4;
int rows = 5;
int seats = 10;

Random generator = new Random();
Venue PrudentialCenter = new Venue(sections,rows,seats);

for(int i = 0; i < 100; i++) {
int a = generator.nextInt(sections) + 1;
int b = generator.nextInt(rows) + 1;
int c = generator.nextInt(seats) + 1;

if(!PrudentialCenter.seatlookup(a,b,c)) {
	System.out.println("Section-" + a + " Row-" + b + " Seat-" + c + " awarded.");
}

else {
	System.out.println("Section-" + a + " Row-" + b + " Seat-" + c + " taken.");

	}
}
}
}
