//Jacky Chen
//Period 2
//TBA project
import java.util.Scanner;

public class PhoneStore extends Room{

	public PhoneStore(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	//Asks user what they want to do everytime they enter a room.
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		setExplored(true);
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("Welcome to the Phonestore.");
		System.out.println("1.Ask the cashier to look at the security cameras. ");
		System.out.println("2.Leave(You must enter 2 twice to leave)");
		int a = 0;
		if(choose(a)==1)
		{
			System.out.println("You saw the thief running East! Press 1 to continue.");
			
		}
		if(choose(a)==2)
		{
			System.out.println("You have left the Phonestore");
			
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