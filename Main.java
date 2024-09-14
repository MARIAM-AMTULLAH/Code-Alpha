import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("\t\t_____________STUDENT GRADE TRACKER SYSTEM_____________ ");
        mainmenu();
    }

public static void mainmenu(){
    Scanner input= new Scanner(System.in);
    System.out.print("\n\n1. GRADE TRACKER");
    System.out.print("\n\n2. EXIT");

    System.out.print("\n\n Enter Your Choice: ");
    int n = input.nextInt();
    switch (n)
    {
        case 1:
            gradetracker();
            break;
        case 2:
            Exit();
            break;
        default:
            System.out.print("\n\n Please Enter Valid Option! ");
            mainmenu();
            break;
    }
}
public static void gradetracker(){
    Scanner input= new Scanner(System.in);
    System.out.print("\nEnter total number of students: ");
    int n = input.nextInt();
    System.out.print("\n\n\tEnter total Scores of 5 subjects! Each subject has 100 Total Marks.Please enter marks between 0 and 500. ");
    double sum=0;
    int highest=0;
    String[] grade= new String[n];

    int[] marks = new int[n];
    for(int i=0;i<marks.length;i++){
        System.out.print("\nEnter The Marks of student "+ (i+1)+":\t");
        marks[i]=input.nextInt();
        if (marks[i] < 0 || marks[i] > 500)
        {
            System.out.println("Invalid marks entered. Please enter marks between 0 and 500.");
            System.out.print("\nEnter The Marks of student "+ (i+1)+":\t");
            marks[i]=input.nextInt();

        }
    }
    double[] per=new double[n];
    int lowest= marks[0];
    for(int i=0;i<marks.length;i++){
        per[i]=(marks[i]*100)/500;
        if(per[i]>=80 && per[i]<=100)
        {
            grade[i]="A+";
        }
        else if (per[i]>=70 && per[i]<=79)
        {
            grade[i]="A ";
        }
        else if(per[i]>=60 && per[i]<=69)
        {
            grade[i]="B ";
        }
        else if (per[i]>=50 && per[i]<=59)
        {
            grade[i]="C ";
        }
        else if (per[i]>=40 && per[i]<=49)
        {
            grade[i]="D ";
        }
        else
        {
            grade[i]="F ";
        }

        if(marks[i]<lowest)
        {
            lowest = marks[i];
        }
        if(marks[i]>highest){
            highest = marks[i];
        }
        sum=sum+marks[i];
    }

    System.out.print("\n__________The Result is__________\n ");
    for(int i=0;i<marks.length;i++)
    {
        System.out.print("\n| Roll No: "+ (i+1) + " | Total: " + marks[i] +  " | Percentage: " + per[i] +" | Grade: "+ grade[i] + " |");
    }
    double avg= sum/n;
    System.out.print("\n\nThe Highest Marks is:\t " + highest);
    System.out.print("\nThe Lowest Marks is:\t " + lowest);
    System.out.print("\nThe Average Marks is:\t " + avg);
    mainmenu();

}
public static void Exit(){
    System.out.print("\n\t\tTHANK YOU :)");

}

}