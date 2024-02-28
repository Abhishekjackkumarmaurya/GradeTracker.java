import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GradeTracker {
   public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
            ArrayList<Integer> grades = new ArrayList<>();

            while (true) {
                System.out.print("Enter student's grade (or -1 to finish): ");
                int grade = S.nextInt();
                if (grade == -1) {
                    break;
                }
                grades.add(grade);
            }

            if (grades.isEmpty()) {
                System.out.println("You didn't entered any grade.");
            } else {
                double sum = 0;
                for (int grade : grades) {
                    sum += grade;
                }
                double average = sum / grades.size();

                int highest = Collections.max(grades);
                int lowest = Collections.min(grades);

                System.out.println("Average grade is: " + average);
                System.out.println("Highest grade is: " + highest);
                System.out.println("Lowest grade: is: " + lowest);
            }
        }
    }


