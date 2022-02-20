
public class Ball extends Pitch {
	
//	public Ball() {
//		setIsHit((int)(Math.random()*4) == 0);
//		// one in three chance of hit
//	}
	
	public Ball(boolean isFast, boolean fastBall, boolean curveBall, boolean slider) {
		
//		if(isFast == true) {
//		setIsHit((int)(Math.random()*4) == 0); // 1/4 chance of hit
//		}
//		else {
//			setIsHit((int)(Math.random()*3) == 0); // 1/3 chance of hit
//		}
//		
		
		
		if(fastBall == true) {
			if(isFast == true) {
				setIsHit((int)(Math.random()*20) >= 11); // 5/10 base chance of hit
			}
			else {
				setIsHit((int)(Math.random()*20)  >= 9); // 6/10 base chance of hit
			}
		}
		else if(curveBall == true) {
			if(isFast == true) {
				setIsHit((int)(Math.random()*20) >= 15); // 3/10 base chance of hit
			}
			else {
				setIsHit((int)(Math.random()*20)  >= 13); // 4/10 base chance of hit
			}
		}
		else if(slider == true) {
			if(isFast == true) {
				setIsHit((int)(Math.random()*20) >= 19); // 1/10 base chance of hit
			}
			else {
				setIsHit((int)(Math.random()*20)  >= 17); // 2/10 base chance of hit
			}
		}
		
		
	}
	
	public void setIsHit(boolean isHit) {
		this.isHit = isHit;
	}
	
	public boolean getIsHit() {
		return isHit;
	}

}
