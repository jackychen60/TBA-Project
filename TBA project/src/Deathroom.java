
public class Deathroom extends Room {



	public Deathroom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the deathroom, you die.Dont worry you will revive at base.");
		Runner.begin();
	}
	

}