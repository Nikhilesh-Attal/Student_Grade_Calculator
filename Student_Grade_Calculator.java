import java.util.Scanner;
public class Student_Grade_Calculator{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Name of student");
        String name = a.nextLine();
        System.out.println("Enter marks obtain in maths out of 100");
        int maths = a.nextInt();
        System.out.println("Enter marks obtain in physics out of 100");
        int physics= a.nextInt();
        System.out.println("Enter marks obtain in chemistry out of 100");
        int chemistry = a.nextInt();
        System.out.println("Enter marks obtain in english out of 100");
        int english = a.nextInt();
        System.out.println("Enter marks obtain in hindi out of 100");
        int hindi = a.nextInt();
        int Total_marks = maths+physics+chemistry+hindi+english;
        int avg = (Total_marks*100)/500;
        String grade = "A";
        if(avg>90)
            grade="A+";
        else if(avg<=90 && avg>80)
            grade="A";
        else if(avg<=80 && avg>70)
            grade="B+";
        else if(avg<=70 && avg>60)
            grade="B";
        else if(avg<=60 && avg>50)
            grade="C+";
        else if(avg<=50 && avg>45)
            grade="C";
        else if(avg<=45 && avg>40)
            grade="D+";
        else if(avg<=40 && avg>35)
            grade="D";
        else if(avg<=35 && avg>30)
            grade="F";
        //System.out.println("Name : " + name);
        System.out.println("Result");
        System.out.println("Maths : " + maths);
        System.out.println("Physics : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println("Hindi : " + hindi);
        System.out.println("Emglish : " + english);
        System.out.println("Total marks : " + Total_marks);
        System.out.println("Average percentage : " + avg +"%");
        System.out.println("Grade : " + grade);
    }
}