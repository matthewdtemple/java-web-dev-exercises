import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<String, Double> studentList = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String student;
        do {
            System.out.print("Student: ");
            student = input.nextLine();

            if (!student.equals("")) {
                System.out.print("ID: ");
                Double studentID = input.nextDouble();
                studentList.put(student, studentID);
                input.nextLine();
            }
        } while (!student.equals(""));
        input.close();

        for (Map.Entry<String, Double> studentMap : studentList.entrySet()){
            System.out.println(studentMap.getKey() + "'s ID number is " + studentMap.getValue());
        };
    }

}
