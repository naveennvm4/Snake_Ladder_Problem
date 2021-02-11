import java.util.Scanner;
public class SnakeLadder {
	final static int LADDER = 1;
	final static int SNAKE = 2;
	final static int FINAL_POSITION = 100;
	final static int INITIAL_POSITION = 0;
	public static void main(String[] args)
	{
	int temp=0;
	int position1=0;
	int position2=0;
	int die1=0;
	int die2=0;
	int noPlay=0;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Start the game");
	String s="START";
	System.out.println("Roll the die");
	while(position1<100 && position2<100)
	{
	int play=(int)(Math.random()*10)%3;
	System.out.println("chance ="+play);
	if(play==noPlay)
	{
	System.out.println("NO PLAY");
	}
	else if(play==LADDER)
	{
		die1 = (int) (Math.random()*(6-1+1)+1);
		die2 = (int) (Math.random()*(6-1+1)+1);
		System.out.println("Player1 Die value = "+die1);
		System.out.println("Player2 Die value = "+die2);
		System.out.println("Ladder");
		if(position1+die1<=100)
		{
		position1=position1+die1;
		temp=position1;
		System.out.println("Player1 position = " +position1);
		}
		else
		{
		System.out.println("Player1 position = " +position1);
		}
		count=count+1;
		if(position2+die2<=100)
		{
		position2=position2+die2;
		temp=position2;
		System.out.println("Player2 position = " +position2);
		}
		else
		{
		System.out.println("Player2 position = " +position2);
		}
		}
		else
		{
		System.out.println("Snake");
		position1=position1-die1;
		position2=position2-die2;
		if(position1<0 || position2<0)
		{
		    System.out.println("Player1 position = " +position1);
		    System.out.println("Player2 position = " +position2);
		}
		else
		{
			System.out.println("Player1 position = " +position1);
			System.out.println("Player2 position = " +position2);
		}
		count=count+1;
		}
	}
	if(position1>position2)
	{
	System.out.println("Player 1 is winner");
	}
	else
	{
	System.out.println("Player 2 is winner");
	}
	System.out.println("Dies has rolled for " +count+ " times");
	}
}


