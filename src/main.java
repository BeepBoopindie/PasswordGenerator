import java.util.Random;
import java.util.Scanner;

public class main {

	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter Password length");
		int passlength = in.nextInt();
		String password = "";
		for(int i = 0; i < passlength; i++)
		{
			double rand = Math.random();
			if(rand < 0.25) {
			
			 int rnd = (int) (Math.random() * 52); // or use Random or whatever
			    char base = (rnd < 26) ? 'A' : 'a';
			   password = "" + password + (char) (base + rnd % 26);
			}else if(rand > 0.25 && rand < 0.9) {
				
				password = "" + password + (int) (Math.random() * 9);
			}else {
				String alphabet = "#$£_-*&^";
				Random r = new Random();
				password = "" + password + alphabet.charAt(r.nextInt(alphabet.length()));
				
			}
		}
			
			System.out.println(password);
		}
		
}
