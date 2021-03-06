//Jacky Chen
//Period 2
//TBA project
public class Room {
	Person occupant;
	int xLoc,yLoc;
	private boolean explored=false;
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{   setExplored(true);
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public void print()
	{
		if(!isExplored() && occupant== null)
		{
			System.out.print("[]");
		}
		else if( occupant!=null)
		{
			
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		else if(isExplored())
		{
			System.out.print("[O]");
		}
	}
	public boolean isExplored() {
		return explored;
	}
	public void setExplored(boolean explored) {
		this.explored = explored;
	}
}
