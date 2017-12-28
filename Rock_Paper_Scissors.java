import java.util.Scanner;
public class Rock_Paper_Scissors {
	public static void main ( String[] args ) {
		System.out.println("Do you want to play a game of Rock-Paper-Scissors?");
		System.out.println("Type in 'Yes' or'yes' to start the game. Type in 'No' or 'no' to close the program.");
		@SuppressWarnings("resource")
		Scanner start = new Scanner(System.in);
		String Response = start.nextLine();
		//Line seven captures User input and converts it into a usable string.*12/19/2017 Does work as a string*
		boolean Ending = false;
		System.out.println(Response);
		while(Ending != true) {
			Response = Response.toLowerCase();
			if(Response.equals("no")) {
				System.out.println("Sorry to hear that. Hope You feel like playing soon.");
				Ending = true;
				}
			else if (Response.equals("yes")) {
				System.out.println("Starting the game");
				System.out.println("The game will go up on until either you or the CPU reaches 10. ");
				System.out.println("However, try to not place the same choice the again and again, your opponet will learn your pattern and beat you.");
				Game_Mode();
				System.out.println("Thanks for playing");
				Ending = true;
				}
			else {
				System.out.println("Please place a proper answer or force close this program");
				start = new Scanner(System.in);
				Response = start.nextLine();
				}
			}
			
			
	}

@SuppressWarnings("resource")
public static void Game_Mode() {
	//and learning pattern code
	System.out.println("Welcome to the game. Try to beat the computer 10 times. Press 1 for Rock, 2 for Paper, and 3 for Scissors");
	System.out.println("Good Luck!");
	int CPU_Score = 0;
	int Human_Score = 0;
	int last_choice = 0;
	int false_AI = 0;
	while((Human_Score != 10) && (CPU_Score != 10)) {
		Scanner choice = new Scanner(System.in);
		String Response = choice.nextLine();
		int move = Integer.parseInt(Response);
		if (move == last_choice)
			false_AI += 1;
		else {
			false_AI = 0;
			last_choice = move;
		}
		switch (false_AI)
		{
		case 2: case 3 : case 4: case 5: case 6: case 7: case 8 : case 9: case 10: case 11 :
			if (move == 1)
			{
				System.out.println("The CPU has read your pattern and choosen Paper.");
				CPU_Score +=1 ;
				System.out.println("CPU scored 1 point");
				System.out.println(CPU_Score + "CPU");
				System.out.println(Human_Score + "Human");
			}
			else if (move == 2)
			{
				System.out.println("The CPU has read your pattern and choosen Scissors.");
				CPU_Score +=1 ;
				System.out.println("CPU scored 1 point");
				System.out.println(CPU_Score + "CPU");
				System.out.println(Human_Score + "Human");
			}
			else if (move == 3)
			{
				System.out.println("The CPU has read your pattern and choosen Rock.");
				CPU_Score +=1 ;
				System.out.println("CPU scored 1 point");
				System.out.println(CPU_Score + "CPU");
				System.out.println(Human_Score + "Human");
			}
			break;
		default :
			float random = (float) Math.random();
			float multiplied = random * 10;
			int ceil = (int)Math.ceil(multiplied);
			if (ceil <= 3) {
				System.out.println("CPU has choosen Rock");;
				}
			else if ((ceil <= 7) && (ceil >= 4)) {
				System.out.println("CPU has choosen Paper");
			}
			else if ((ceil <= 10) && (ceil >= 8)) {
				System.out.println("CPU has choosen Scissors");
			}
			switch (move) 
			{
			case 1:
				if (ceil >= 8) {
					System.out.println("You scored 1 point");
					Human_Score +=1;
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
				else if ((ceil >=4) && (ceil <= 7)) 
				{
					System.out.println("CPU scored 1 point");
					CPU_Score +=1;
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
				else 
				{
					System.out.println("We have a tie");
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
			case 2:
				if (ceil <= 3) {
					System.out.println("You scored 1 point");
					Human_Score +=1;
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
				else if ((ceil >=8) && (ceil <= 10)) 
				{
					System.out.println("CPU scored 1 point");
					CPU_Score +=1;
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
				else 
				{
					System.out.println("We have a tie");
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
			case 3 :
				if ((ceil <= 7) && (ceil >= 4)) {
					System.out.println("You scored 1 point");
					Human_Score +=1;
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
				else if (ceil <= 3) 
				{
					System.out.println("CPU scored 1 point");
					CPU_Score +=1;
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
				else
				{
					System.out.println("We have a tie");
					System.out.println(CPU_Score + "CPU");
					System.out.println(Human_Score + "Human");
					break;
				}
				}
			
		}

	}
	System.out.println(CPU_Score + "CPU");
	System.out.println(Human_Score + "Human");
	}
}
