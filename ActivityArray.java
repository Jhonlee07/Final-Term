import java.util.Scanner;
public class ActivityArray {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int[] grade = {75, 86, 84, 90, 87};
        
        System.out.println("Initial Grade: ");
        System.out.println("Subject 1: " + grade [0]);
        System.out.println("Subject 2: " + grade [1]);
        System.out.println("Subject 3: " + grade [2]);
        System.out.println("Subject 4: " + grade [3]);
        System.out.println("Subject 5: " + grade [4]);

        System.out.print("Please enter student index: ");
        int studentIndex = scanner.nextInt();
        System.out.print("Enter new student grade: ");
        int studentGrade = scanner.nextInt();

        grade [studentIndex] = studentGrade; 

        System.out.println("Updated Grade: ");
        System.out.println("Subject 1: " + grade [0]);
        System.out.println("Subject 2: " + grade [1]);
        System.out.println("Subject 3: " + grade [2]);
        System.out.println("Subject 4: " + grade [3]);
        System.out.println("Subject 5: " + grade [4]);

        System.out.println("Total No. of Subject: " + grade.length);

        int totalGrade = 0;

        for (int i = 0; i < grade.length; i++){
            totalGrade += grade[i];
        }
      
        double average = (double)totalGrade / grade.length;

        System.out.println("The average grade is: " + average);


    }
}
