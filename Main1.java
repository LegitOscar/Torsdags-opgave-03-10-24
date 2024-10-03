import java.util.ArrayList;


public class Main1 {

    public static void main(String[] args) {

    	

        ArrayList<String> actions = new ArrayList<>();
        actions.add(" Start game");
        actions.add(" Resume game");
        actions.add(" Pause game");
        actions.add(" End game");
        System.out.print(actions.get(2)); // expected output: "Pause game"

        GameMenu gamemenu = new GameMenu(actions);

        //gamemenu.displayMenu();

        gamemenu.getAction();

        String userChoice = gamemenu.getAction();
}

public static void doAction(int action){

   switch(userChoice){
   	this.userChoice = userChoice;
case 1:
	System.out.println("Starting the game");
    break;
case 2:
    System.out.println("Resuming the game");
    break;
case 3:
    System.out.println("Game paused");
    break;
case 4:
	System.out.println("Closing the game");
	break;
}
}
}


