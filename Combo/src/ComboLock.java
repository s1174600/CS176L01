

public class ComboLock {
	private int input = 0;
	private int a, b, c;
	private boolean w = true;
	private boolean x, y, z = false;
	private boolean open = false;
	
	public ComboLock(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c = c;
	}
	
	public void reset()
	{
		w = true;
		x = false;
		y = false;
		z = false;
	 }
	
	public void turnLeft(int ticks) {
	if (x == true) {
		input = input + ticks;
	}
	
	if(input == b) {
		y = true;
	}
	
	else {
		y = false;
	}
	}
	
	public void turnRight(int ticks) {
	if (w) {
		input = 40 - ticks;
	}
	
	if (input == a) {
		x = true;
	    w = false;
	}
	
	else {
		if(input - ticks > 0) {
			z = true;
	}
	
		
	input = 40 - (ticks - input);
	         z = false;
	         
	    if(input == c) {
	    	z = true;
	    }
		
	}
	}
	
	public boolean open() {
	if (x && y && z) {
		open = true;
	
	System.out.println("You opened the lock!");
	}
	
	else {
		open = false;
		
	System.out.println("You did not open the lock!");
	}
	return open;
	}
	
	public int getinput() {
		return input;
	}
	   
	    }
