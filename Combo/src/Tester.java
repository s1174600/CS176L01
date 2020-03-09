
	public class Tester {
	
	public static void main(String[] comp) {
	ComboLock a = new ComboLock(5,25,30);
	a.turnRight(35);
	System.out.println(a.getinput());
	
	a.turnLeft(20);
	System.out.println(a.getinput());
	
	a.turnRight(35);
	System.out.println(a.getinput());
	
	System.out.println(a.open());
	
	
	ComboLock b = new ComboLock(5,25,30);
	b.turnRight(35);
	System.out.println(b.getinput());
	
	b.turnLeft(20);
	System.out.println(b.getinput());
	
	b.turnRight(33);
	System.out.println(b.getinput());
	
	System.out.println(b.open());
	}
}
