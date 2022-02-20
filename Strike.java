
public class Strike extends Pitch {

	public Strike() {
		setIsHit((int)(Math.random()*3) >= 1);
		// one in two chance of hit
	}

//	public Strike(boolean isFast) {
//
//		if(isFast == true) {
//			setIsHit((int)(Math.random()*2) >= 1); // 1/2 chance of hit
//			setIsStrike((int)(Math.random()*8) >= 3); // 5/8 chance of being a strike
//		}
//		else {
//			setIsHit((int)(Math.random()*3) >= 1); // 2/3 chance of hit
//			setIsStrike((int)(Math.random()*8) >= 1); // 7/8 chance of being a strike
//		}
//
//	}

	public Strike(boolean isFast, boolean fastBall, boolean curveBall, boolean slider) { // maybe have them choose which is improved at beginning of game if you have time

		if(fastBall == true) {
			if(isFast == true) {
				setIsHit((int)(Math.random()*20) >= 8); // 6/10 base chance of hit
				setIsStrike((int)(Math.random()*10) >= 2); // 8/10 chance of being a strike
			}
			else {
				setIsHit((int)(Math.random()*20)  >= 7); // 7/10 base chance of hit
				setIsStrike(true); // 10/10 chance of being a strike
			}
		}
		else if(curveBall == true) {
			if(isFast == true) {
				setIsHit((int)(Math.random()*20) >= 13); // 4/10 base chance of hit
				setIsStrike((int)(Math.random()*10) >= 6); // 6/10 chance of being a strike
			}
			else {
				setIsHit((int)(Math.random()*20)  >= 11); // 5/10 base chance of hit
				setIsStrike((int)(Math.random()*10)  >= 3); // 7/10 chance of being a strike
			}
		}
		else if(slider == true) {
			if(isFast == true) {
				setIsHit((int)(Math.random()*20) >= 17); // 2/10 base chance of hit
				setIsStrike((int)(Math.random()*10) >= 6); // 4/10 chance of being a strike
			}
			else {
				setIsHit((int)(Math.random()*20)  >= 15); // 3/10 base chance of hit
				setIsStrike((int)(Math.random()*10) >= 6); // 5/10 chance of being a strike
			}
		}

	}

	public void setIsHit(boolean isHit) {
		this.isHit = isHit;
	}

	public boolean getIsHit() {
		return isHit;
	}

	public void setIsStrike(boolean isStrike) {
		this.isStrike = isStrike;
	}

	public boolean getIsStrike() {
		return isStrike;
	}

}
