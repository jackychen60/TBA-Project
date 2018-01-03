import java.util.Scanner;

public class Bathroom extends Room{

	public Bathroom(int x, int y) {
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
		System.out.println("This is the mens room.");
		System.out.println("What would you like to do?");
		System.out.println("1.Search the bathroom.");
		System.out.println("2.Leave.");
		if(choose(a=1))
		{
			System.out.println("You found a clue.");
		}
		
		}
	
	public static int choose(int a)
	{
		Scanner in = new Scanner(System.in);
		return a = in.nextInt();
		
	}
}