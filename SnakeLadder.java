import java.util.Scanner;
public class SnakeLadder{
	final static int LADDER = 1;
	final static int SNAKE = 2;
	final static int FINAL_POSITION = 100;
	final static int INITIAL_POSITION = 0;

	public static void main(String[] args){
	int temp=0;
	int position=0;
	int die=0;
	int noPlay=0;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Start the game");
	String s="START";
	System.out.println("Roll the die");
	while(position<100)
	{
	int play=(int)(Math.random()*10)%3;
	System.out.println("chance ="+play);
	if(play==noPlay)
	{
		System.out.println("NO PLAY");
		}
	else if(play==LADDER)
	{
		die = (int) (Math.random()*(6-1+1)+1);
		System.out.println("Die value = "+die);
		System.out.println("Ladder");
		if(position+die<=100)
		{
			position=position+die;
			temp=position;
			System.out.println("Player position = " +position);
		}
		else
		{
			System.out.println("Player position = " +position);
		}
		count=count+1;
		}
	else
	{
		System.out.println("Snake");
		position=position-die;
		temp=position;
		if(position<0)
		{
			position=0;
			temp=position;
			System.out.println("Player position = " +position);
		}
		else
		{
			System.out.println("Player position = " +position);
		}
		count=count+1;
		}
	}
	System.out.println("Die has rolled for " +count+ " times");
	}
}
