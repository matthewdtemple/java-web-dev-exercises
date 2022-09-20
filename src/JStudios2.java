import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JStudios2 {

    public static void main(String[] args){
        HashMap<String, Integer> chars = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter text: ");

        String userText = input.nextLine();

        for (int i = 0; i < userText.length(); i++){
            int count = 0;
            for (int j = 0; j < userText.length(); j++){
            if(String.valueOf(userText.charAt(i)).equals(String.valueOf(userText.charAt(j)))){
                count += 1;
                }
            }
            chars.put(String.valueOf(userText.charAt(i)), count);
        }
        for(Map.Entry<String,Integer> results : chars.entrySet()){
            System.out.println(results.getKey()+ ": " + results.getValue());
        }
    }
}
