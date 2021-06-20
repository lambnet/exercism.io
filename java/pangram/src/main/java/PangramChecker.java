import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
       input = input.toLowerCase();
       for(char c = 'a'; c <= 'z'; c++){
           // check if the char c inside the String input
           if(input.indexOf(c) < 0){
               return false;
           }
       }
       return true;
    }
}
