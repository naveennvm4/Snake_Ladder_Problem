public class SnakeLadder {
	final static int FINAL_POSITION=100;
	final static int INITIAL_POSITION=0;
	final static int LADDER=1;
	final static int SNAKE=2;
	public static void main(String[] args)
	{
	int noPlay=0;
	int position=0;
	int die=0;
	int play=(int)(Math.random()*10)%3;
	System.out.println("chance "+Play);
	if(play==noPlay)
	{
		System.out.println("pass the chance");
	}
	else
	{
	die = (int) (Math.random()*(6-1+1)+1);
	System.out.println("Die value ="+die);
		if(play==LADDER)
		{
		System.out.println("Ladder");
		position=die+die;
		System.out.println("Player Position =" +position);
		}
		else
		{
		System.out.println("Snake");
		position=die-die;
		System.out.println("Player Position =" +position);
		}
	}
	}
}
