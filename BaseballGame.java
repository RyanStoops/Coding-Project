
public class BaseballGame {

	private int score = 0;
	private int strikeCount;
	private int ballCount;



	public BaseballGame() {

		atBat(3);

	}

	public void atBat(int inning) {

		int t = inning;
		for(int v = 1; v <= t; v++) {

			Batter batter = new Batter();
			boolean swingsOften = batter.getSwingsOften();
			boolean isStrike = false;
			boolean isFast = false;


			if(swingsOften == false) {
				System.out.println("This batter doesn't swing often");
			}
			else {
				System.out.println("This batter swings very often");
			}

			strikeCount = 0;
			ballCount = 0;
			for(int pitchCount = 0; pitchCount < 6; pitchCount++) {
				if(strikeCount == 3) {
					break;
				}
				if(ballCount == 4) {
					break;
				}


				boolean fastBall = false;
				boolean curveBall = false;
				boolean slider = false;
				char pitchType = 'd';
				String sOrB = "m";
				String fOrS = "l";

				int i = 0;
				while(i < 1) {
					System.out.println("Do you want to throw a fastball, curveball, or slider? (f/c/s)");
					pitchType = TextIO.getlnChar();
					if(pitchType == 'f') {
						fastBall = true;
						i+=1;
					}
					else if(pitchType == 'c') {
						curveBall = true;
						i+=1;
					}
					else if(pitchType == 's') {
						slider = true;
						i+=1;
					}
					else {
						System.out.println("That's not an option you bozo!");
					}
				}



				System.out.println("Do you want to throw a strike or a ball? (s/b)");
				int a = 0;
				while(a < 1) {
					sOrB = TextIO.getln();
					if(sOrB.equals("s")) {
						isStrike = true;
						a+=1;
					}
					else if(sOrB.equals("b")) {
						isStrike = false;
						a+=1;
					}
					else {
						System.out.println("That's not an option you bozo!");
					}
				}

				System.out.println("Do you want to throw fast or slow? (f/s)");
				int b = 0;
				while(b < 1) {
					fOrS = TextIO.getln();
					if(fOrS.equals("f")) {
						isFast = true;
						b+=1;
					}
					else if(fOrS.equals("s")) {
						isFast = false;
						b+=1;
					}
					else {
						System.out.println("That's not an option you bozo!");
					}
				}

				if(isFast == true && isStrike == true) {
					// call a class for odds of it actually being a strike (decreased odds)
				}
				else if (isFast == false && isStrike == true){
					// call a class for odds of it actually being a strike (increased odds)
				}

				Strike strike = new Strike(isFast, fastBall, curveBall, slider);
				Ball ball = new Ball(isFast, fastBall, curveBall, slider);

				if(isStrike == true) {
					if(strike.getIsStrike() == true) {
						isStrike = true;
					}
					else {
						isStrike = false;
					}
				}

				Batter swinger = new Batter(swingsOften, isStrike);

				if(swinger.getSwings() == true) {
					if(isStrike == true) {
						if(strike.getIsHit() == true) {
							score += -1;
							System.out.println("He hit the ball!");
							System.out.println("Score:" + score);
							System.out.println("Count (b/s):" + ballCount + "-" + strikeCount);
							break;
						}
						else {
							System.out.println("He swung and missed the ball!");
							strikeCount++;
							score += 1;
							System.out.println("Score:" + score);
							System.out.println("Count (b/s):" + ballCount + "-" + strikeCount);
							if(strikeCount == 3) {
								System.out.println("You struck him out!");
								score += 3;
								System.out.println("Score:" + score);
								break;
							}
							continue;
						}
					}
					else {
						if(ball.getIsHit() == true) {
							System.out.println("He hit the ball!");
							score += -1;
							System.out.println("Score:" + score);
							System.out.println("Count (b/s):" + ballCount + "-" + strikeCount);
							break;
						}
						else {
							System.out.println("He swung and missed the ball!");
							strikeCount++;
							score += 1;
							System.out.println("Score:" + score);
							System.out.println("Count (b/s):" + ballCount + "-" + strikeCount);
							if(strikeCount == 3) {
								System.out.println("You struck him out!");
								score += 3;
								System.out.println("Score:" + score);
								break;
							}
							continue;
						}
					}
				}
				else {
					if(isStrike == true) {
						System.out.println("It was a strike and he didn't swing!");
						strikeCount++;
						score += 1;
						System.out.println("Score:" + score);
						System.out.println("Count (b/s):" + ballCount + "-" + strikeCount);
						if(strikeCount == 3) {
							System.out.println("You struck him out!");
							score += 3;
							System.out.println("Score:" + score);
							break;
						}
						continue;
					}
					else {
						System.out.println("It was a ball and he didn't swing!");
						ballCount++;
						if(ballCount == 3) {
							score += -1;
						}
						System.out.println("Score:" + score);
						System.out.println("Count (b/s):" + ballCount + "-" + strikeCount);
						if(ballCount == 4) {
							System.out.println("You walked him!");
							score += -2;
							System.out.println("Score:" + score);
							break;
						}
						continue;
					}
				}
			}
		} // end of for loop
		System.out.println("You needed a score of 10 to not be the worst pitcher in MLB history, you had: " + score + " points");
		if(score >= 10) {
			System.out.println("Congratulations! You are NOT the worst pitcher in MLB history!");
			System.out.println("The crowd is cheering, your teammates are running onto the field, you can now retire peacefully!");
		}
		else {
			System.out.println("The crowd boos you off the field, you have disgraced your team.");
			System.out.println("You are LITERALLY the worst player in MLB history.");
		}
	} // end of game pretty much

}
