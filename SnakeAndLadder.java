
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		Player playing = new Player();
	     playing.chooseOption();
	     playing.ensuringExactWinningPosition();
	}

}

class Player{
	int playerPosition = 0;
    double die;
    private static final int winningPoint = 100;
    
    public void dieValueGeneration() {
    	die = 1+(Math.floor(Math.random() * 10 ) % 6);
    }
    public void chooseOption(){
    	dieValueGeneration();
             int choose = (int) Math.floor(Math.random() * 10) % 3;
             switch (choose) {
                 case 0:
                     System.out.println("No Play");
                     break;
                 case 1:
                     System.out.println("Yay!! I got ladder");
                     playerPosition += die;
                     break;
                 default:
                     System.out.println("oops!! snake killed me");
                     playerPosition -= die;
                     break;
             }
     }
    public void repeatingTillTheWinningPosition() {
    	int numberOfTimePlayerPlayed=0;
    	while(playerPosition < winningPoint ) {
    		numberOfTimePlayerPlayed++;
            System.out.println("Number of times player played: "+ numberOfTimePlayerPlayed);
            System.out.println("Die Value: "+die);
    		chooseOption();
    	}
    }
    public void ensuringExactWinningPosition() {
    	repeatingTillTheWinningPosition();
    	if(playerPosition> winningPoint)
         playerPosition = winningPoint;
    	System.out.println("Player position " + playerPosition);
    	System.out.println("Hip....Hip...Hurrey....I won!!!");
    }  
}