import java.util.Scanner;
public class ActivityForloop {
   public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    
    double[] grades = new double[7];
    String[] subjects = {"Fundementals of Programming", "Readings in Philippine History", "Introduction to Computing", "PATHFIT", "Purposive Communication", "Understanding the Self", "Science Technology & Society"};

    System.out.println("Please enter the grades of the following couses: ");
    for (int i = 0; i < subjects.length; i++){
       // System.out.print(subjects[i] + ": ");
        // grades[i] = scanner.nextDouble();
        double grade;
        do{
            System.out.print(subjects[i] + " : ");
            while (!scanner.hasNextDouble()){
                System.out.println("Invalid grade. Please enter a numeric value. ");
                scanner.next();
            }
            grade = scanner.nextDouble();
            if (grade < 0 || grade > 4){
                System.out.println("Invalid grade. Please enter a number permitted to you. ");
            }
        }while (grade < 0 || grade > 4);
        grades[i] = grade;

    }

    System.out.println("\nGrades of the subjects: ");
    for (int i = 0; i < subjects.length; i++){
        System.out.println(subjects[i] + ": " + grades [i]) ;

    }

    int totalGrade = 0;

    for (int i = 0; i < grades.length; i++){
        totalGrade += grades[i];
    }

    double average = (double)totalGrade / grades.length;

    System.out.printf("\nYour average grade is: %.2f " , average);
    System.out.print("\n");
    System.out.println("\nGrade Classification: ");

for (int i = 0; i < grades.length; i++){
    char gradesClassification;
    if (grades[i] >= 4){
        gradesClassification = 'A';
    }
    else if (grades[i] >= 3){
        gradesClassification = 'B';
    }
   else if (grades[i] >= 2){
        gradesClassification = 'C';
    }
    else if (grades[i] >= 1){
        gradesClassification = 'D';
    }
    else {
        gradesClassification = 'F';
    }
    System.out.println(subjects[i] + " : " + grades[i] + " -> " + gradesClassification );
    
}

     System.out.println("\nWell Done!");  

        

        double maxGrade = grades[0];
        double minGrade = grades[0];
        String maxSubject = subjects[0];
        String minSubject = subjects[0];

        for (int i = 0; i < grades.length; i++)
        {
          if (grades [i] > maxGrade){
            maxGrade = grades[i];
            maxSubject = subjects[i];
          }

        }


        System.out.println("\nHighest grade: " + maxSubject + " : " + maxGrade);


        for (int i = 0; i < grades.length; i++){
            if (grades[i] < minGrade){
                minGrade = grades[i];
                minSubject = subjects[i];

            }
        }

        System.out.println("\nLowest grade: " + minSubject + " : " + minGrade);

        System.out.println("\nCourses with grades below 2.0");
        for (int i = 0; i < subjects.length; i++){
           if (grades[i] < 2){
               System.out.println(subjects[i] + " : " + grades[i]);
           }
        }

     scanner.close();
   }
    
}
