import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{


public ArrayList<String> actions;


public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    
    public void displayMenu(){
        for(String actions : actions){
        	System.out.println(actions);
      }
    } 
    

        public String getAction(){
        	
        	for(String actions : actions){
        	System.out.println(actions);
        }
            System.out.println("Type a number to choose an action");
        	Scanner scanner = new Scanner(System.in);
        	String playerInput = scanner.nextLine();
        	System.out.println("You have chosen " + playerInput);
        	return playerInput;

    }

}
