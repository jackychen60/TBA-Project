//Jacky Chen
//Period 2
//TBA project
import java.util.Scanner;

public class Bathroom extends Room{

	public Bathroom(int x, int y) {
		super(x, y);
	}
	@Override
	//Asks user what they want to do everytime they enter a room.
	public void enterRoom(Person x) {
	

		setExplored(true);
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("This is the mens room.");
		System.out.println("What would you like to do?");
		System.out.println("1.Search the bathroom.");
		System.out.println("2.Leave(You must enter 2 twice to leave)");
		int a = 0;
		if(choose(a)==1)
		{
			System.out.println("You found a clue!");
			System.out.println("It reads: 2,2. Press 1 to continue");
		}
	 if(choose(a)==2)
		{
			System.out.println("You have left the bathroom");
			
		}
		}
	//This method allows the user to input choice 1 or choice 2
	public static int choose(int a)
	{
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		 a = reader.nextInt();
		
		return a;
		
	}

}