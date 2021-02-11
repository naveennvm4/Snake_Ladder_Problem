import java.util.Scanner;
public class SnakeLadder
{
	final static int FINAL_POSITION = 100;
	final static int INITIAL_POSITION = 0;
	final static int LADDER = 1;
	final static int SNAKE = 2;
	public static void main(String[] args)
	{
	int noPlay = 0;
	int position = 0;
	int die = 0;
	Scanner sc=new Scanner(System.in);
	String s="START";
	System.out.println("Start the Game");
	String st=sc.next();
	if(s.toLowerCase().toUpperCase().contains(st.toLowerCase().toUpperCase()))
	while(position<=100)
	{
		int play=(int)(Math.random()*10)%3;
		System.out.println("chance = "+play);
		if(play==noPlay)
		{
			System.out.println("No play");
		}
		else
		{
			die = (int) (Math.random()*(6-1+1)+1);
			System.out.println("Die value = "+die);
			if(play==LADDER)
			{
				System.out.println("Ladder");
				position=position+die;
				System.out.println("Ladder Position = " +position);
			}
			else
			{
				System.out.println("Snake");
				position=position-die;
				if(position<0)
				{
					System.out.println("Snake Position = " +position);
				}
				else
				{
					System.out.println("Position = " +position);
				}
			}
			}
		}
	}
}
