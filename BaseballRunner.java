
public class BaseballRunner {

	public static void main(String[] args) {

		System.out.println("Would you like the story's instructions that also provides tips (a) or the basic instructions (any button)?");
		char a = TextIO.getlnChar();
		if(a == 'a') {
			System.out.println("Hey there!");
			System.out.println("Are you ready tomorrow? It's a big day. You're pitching one last inning in the MLB (pitch against 3 players) before you retire.");
			System.out.println("Based on statistics from your entire career, you are currently on track to retire as the worst pitcher in MLB history!");
			System.out.println("Your statistics are based on a simple points system, you get points for certain achievements, or lose points for your (many) failures.");
			System.out.println("You can earn points by: Throwing a Strike (1 point) or Striking Someone Out (3 points)");
			System.out.println("You can lose points by: Throwing 3 Balls (-1 point), Allowing a Hit (-1 point), or Walking the Batter (-2 points)");
			System.out.println("These batters aren't very smart. For each batter, we'll tell you whether or not they like to swing a lot, or if they don't swing very often");
			System.out.println("If they swing a lot, you can try throwing a ball to trick them into swinging at it, batters have decreased chances of hitting a ball rather than a strike.");
			System.out.println("If they don't swing very much, you might want to throw a strike, since there's less risk of them hitting the ball.");
			System.out.println("You can also decide how difficult your throw is, you can throw it fast or slow.");
			System.out.println("If it's fast, the batter is less likely to hit the ball, but the ball is less accurate, and you might throw a ball (not a strike) on accident.");
			System.out.println("If it's slow, the batter is more likely to hit the ball, but you're more likely to throw a strike (if you chose to throw a strike).");
			System.out.println("Lastly, you can choose between throwing a fastball, a curveball, or a slider.");
			System.out.println("Fastballs are more likely to be strikes, but more likely to be hit.");
			System.out.println("Sliders are less likely to be strikes, but less likely to be hit.");
			System.out.println("Curveballs are a sort of middleground between the two pitches.");
		}
		else {
			System.out.println("You're pitching one last inning in the MLB (pitch against 3 players) before you retire.");
			System.out.println("Based on statistics from your entire career, you are currently on track to retire as the worst pitcher in MLB history!");
			System.out.println("Your statistics are based on a simple points system, you get points for certain achievements, or lose points for your (many) failures.");
			System.out.println("Throwing a Strike (1 point) or Striking Someone Out (3 points)");
			System.out.println("Throwing 3 Balls (-1 point), Allowing a Hit (-1 point), or Walking the Batter (-2 points)");
			System.out.println("Some players swing a lot, others don't, we'll tell you beforehand.");
			System.out.println("Type f to throw fast (less likely to get hit, less likely to be a strike).");
			System.out.println("Type s to throw slow (more likely to get hit, more likely to be a strike).");
			System.out.println("Fastball: type f, more accuracy, less difficult to hit");
			System.out.println("Curveball: type c, sorta accurate, sorta difficult to hit");
			System.out.println("Slider: type s, less accurate, more difficult to hit");
		}
		
		
		
		
		
		
		
		System.out.println("You must have 10 or more points once the inning is over in order to not be the worst MLB pitcher ever.");
		
		BaseballGame bball = new BaseballGame();
	}

}
