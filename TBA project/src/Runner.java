
import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args) {
	
		Room[][] building = new Room[3][3];
		//Fill the building with normal rooms
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
				
			}
		}
		
		//Create the thief room.
		int x = (int)(2);
		int y = (int)(2);
		building[x][y] = new ThiefRoom(x, y);
		//Create the first room
		int a = (int)(0);
		int b = (int)(0);
		building[a][b] = new FirstRoom(a, b);
		//Create the food court
		int c =(int)(0);
		int d =(int)(1);
		building[c][d] = new FoodCourt(c,d);	 
		//Create the Macy's
		int e =(int)(0);
		int f =(int)(2);
		building[e][f] = new Macys(e,f);
		//Create the Target
		int g =(int)(1);
		int h =(int)(0);
		building[g][h] = new Target(g,h);
		//Create the BestBuy
		int i =(int)(1);
		int j =(int)(1);
		building[i][j] = new BestBuy(i,j);
		//Create the Bathroom
		int k =(int)(1);
		int l =(int)(2);
		building[k][l] = new Bathroom(k,l);
		//Create the phone store
		int m =(int)(2);
		int n =(int)(0);
		building[m][n] = new PhoneStore(m,n);
		//Create the Staples
		int o =(int)(2);
		int p =(int)(1);
		building[o][p] = new Staples(o,p);
		
		 //Setup player 1 and the input scanner
		Person player1 = new Person(0,0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{   
			
			Board map = new Board(building);
			map.printBoard();
			
			
			//Room explored = new Room();
			System.out.println("Where would you like to move? (Choose W, S, A, D)");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "d":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "a":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	
}
