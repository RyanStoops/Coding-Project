
public class Batter {

	private boolean swingsOften;
	private boolean swings;
//	private boolean isFast;

	public Batter() {
		setSwingsOften((int)(Math.random()*2) == 1);
		// one in two chance of being a swinger
	}

	public void setSwingsOften(boolean swingsOften) {
		this.swingsOften = swingsOften;
	}

	public boolean getSwingsOften() {
		return swingsOften;
	}


	public Batter(boolean swingsOften, boolean strike) {

//		if(isFast == true) {
			if(strike == true) {
				if(swingsOften == true) {
					setSwings((int)(Math.random()*16) >= 5); // 11/16 chance of swinging
				}
				else {
					setSwings((int)(Math.random()*16) >= 8); // 8/16 chance of swinging
				}
			}
			else {
				if(swingsOften == true) {
					setSwings((int)(Math.random()*16) >= 8); //  8/16 chance of swinging
				}
				else {
					setSwings((int)(Math.random()*16) >= 11); // 5/16 chance of swinging
				}
			}
		}
//		else {
//			if(strike == true) {
//				if(swingsOften == true) {
//					setSwings((int)(Math.random()*5) >= 1); // 4/5 chance of swinging
//				}
//				else {
//					setSwings((int)(Math.random()*3) >= 1); // 2/3 chance of swinging
//				}
//			}
//			else {
//				if(swingsOften == true) {
//					setSwings((int)(Math.random()*2) == 1); // 1/2 chance of swinging
//				}
//				else {
//					setSwings((int)(Math.random()*4) == 1); // 1/4 chance of swinging
//				}
//			}
//		}
//
//
//
//	}

	public void setSwings(boolean swingOdds) {
		this.swings = swingOdds;
	}

	public boolean getSwings() {
		return swings;
	}


}
