
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		 Player choice = new Player();
	     choice.chooseOption();
	}

}

class Player{
    int playerPosition = 0;
    private final int winning_point = 100;
    
    double die = 1+(Math.floor(Math.random() * 10 ) % 6);
    
    public void chooseOption(){

    	 while(playerPosition<winning_point) {
             if (playerPosition < 0)
                 playerPosition = 0;
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
             System.out.println("Die Value: "+die);
         }
    	 if(playerPosition>winning_point)
             playerPosition =winning_point;
         System.out.println("Player position " + playerPosition);
         System.out.println("Hip....Hip...Hurrey....I won!!!");
     }
    
}