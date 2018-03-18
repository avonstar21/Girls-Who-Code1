import java.util.Scanner;

public class play_game {

	public static String choices()
	{
		int choice = (int)Math.random()*3;
		if(choice == 0)
		{
			return "Rock";
		}
		else if(choice == 1)
		{
			return "Paper";
		}
		else
		return "Scissors";
	}
	
	public static String play(String arg)
	{
		String comp = choices();
		if(comp.equals(arg))
		{
			return "It's a tie!";
		}
		else if(comp.equals("Rock"))
		{
			if(arg.equals("Scissors"))
			{return "The computer played rock, you lose!";}
			else
			{
				return "The computer played rock, you win!";
			}
		}
		else if(comp.equals("Paper"))
		{
			if(arg.equals("Scissors"))
			{return "The computer played paper, you win!";}
			else
			{
				return "The computer played paper, you lose!";
			}
		}
		else if(comp.equals("Scissors"))
		{
			if(arg.equals("Paper"))
			{return "The computer played scissors, you lose!";}
			else
			{
				return "The computer played scissors, you win!";
			}
		}
		
		return null;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rock, Paper or Scissors: ");
		String played = sc.next();
		System.out.println(play(played));
	}
}
