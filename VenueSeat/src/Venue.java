
public class Venue {
private boolean[][][] allseats;

public Venue(int sections, int rows, int seats) {
allseats = new boolean[sections] [rows] [seats];

for(int x = 0; x < sections; x++) {
	
for(int y = 0; y < rows; y++) {
	
for(int z = 0; z < seats; z++) {
	allseats[x][y][z] = false;
}
	}
}
}

public boolean seatlookup(int sections, int rows, int seats) {
	
if(allseats[sections - 1][rows - 1][seats - 1] == false) {
	allseats[sections - 1][rows - 1][seats - 1] = true;
return true;
}

else {
	return false;
}

}
	}
