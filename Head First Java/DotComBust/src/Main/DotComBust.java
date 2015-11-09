package Main;
import java.util.*;
import java.util.ArrayList;
public class DotComBust 
{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame()
    {
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        
        one.setName("bbc.co.uk");
        two.setName("reddit.com");
        three.setName("funnyjunk.com");
        
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("your goal is to sink three dot coms.");
        System.out.println("try to sink them all in the fewest number of guesses.");
        
        for(DotCom dotComToSet : dotComsList)//for each loop.
        {            
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying()
    {
        while(!dotComsList.isEmpty())
        {
            String userGuess = helper.getUserInput("enter a guess.");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess)
    {
        numOfGuesses++;
        String result = "miss";
        for(int x = 0; x < dotComsList.size(); x++)
        {
            result = dotComsList.get(x).checkYourself(userGuess);
            if(result.equals("hit"))
            {
                break;
            }
            if(result.equals("kill"))
            {
                dotComsList.remove(x);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame()
    {
        System.out.println("all dot coms are now dead!");
        if(numOfGuesses <= 18)
        {
            System.out.println("it only took you" + numOfGuesses + "guesses.");
        }
        else
        {
            System.out.println("took you long enough" + numOfGuesses + "guesses.");
        }
    }
    public static void main (String [] args)
    {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }   
}
