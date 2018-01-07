

public class FirstRoom extends Room{

	public FirstRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		setExplored(true);
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You are a cop and the thief you are chasing just ran into a mall. Go through the stores in the mall to find the thief.");
		System.out.println("You are equipped with a gun and a set of handcuffs.");
		System.out.println("You have entered the mall.");
		
	}
}
