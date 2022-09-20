import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args){
        int[] array1 = {1, 1, 2, 3, 5, 8};
        for(int i : array1){
            if ((i%2) == 1){
                System.out.println(i);
            }
        }
        String riddle = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrStr = riddle.split("\\.");
        System.out.println(Arrays.toString(arrStr));
    }
}
