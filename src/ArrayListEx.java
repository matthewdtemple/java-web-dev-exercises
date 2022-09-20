import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

    public static int sumOfEven(ArrayList<Integer> arrList){
        int sum = 0;
        for (int i: arrList){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static ArrayList<String> fiveLength(ArrayList<String> arrList){
        ArrayList<String> hasFive = new ArrayList<>();
        for (String i: arrList){
            if(i.length() == 5){
                hasFive.add(i);
            }
        }
        return hasFive;
    }

   public static void main(String[] args){
       ArrayList<String> testArr = new ArrayList<>();
       testArr.add("test");
       testArr.add("Testr");
       System.out.println(fiveLength(testArr));

       System.out.println("Enter a number for search: ");
       Scanner input = new Scanner(System.in);
       int userNum = input.nextInt();


   }

}


