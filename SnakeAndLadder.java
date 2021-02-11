
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		 Player choice = new Player();
	     choice.chooseOption();
	}

}

class Player{
    int playerPosition = 0;
    double die = 1+(Math.floor(Math.random() * 10 ) % 6);
    
    public void chooseOption(){

        int choose = (int) Math.floor(Math.random() * 10 ) % 3;
        switch(choose){
            case 0:
                System.out.println("No Play");
                System.out.println(playerPosition);
                break;
            case 1:
                System.out.println("Yay!! I got ladder");
                playerPosition +=die;
                break;
            default:
                System.out.println("oops!! snake killed me");
                playerPosition -=die;
                break;
        }
        System.out.println("Player position "+playerPosition);
    }
    
}