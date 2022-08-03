import java.util.Scanner;
public class Marks_calculater {
    public static void main(String[] args)
    {
        double total,average,Percentage;
        System.out.println("Enter marks of your given subjects");
       try( Scanner marks = new Scanner(System.in)){
        System.out.println("English:");
        double English = marks.nextDouble();
        System.out.println("Maths:");
        double Maths= marks.nextDouble();
        System.out.println("science:");
        double science = marks.nextDouble();
        System.out.println("History:");
        double History = marks.nextDouble();
        System.out.println("ss:");
        double ss = marks.nextDouble();
        total = English + Maths + science + History + ss;
        average= (total/5);
        Percentage = (total/500)*100;
        System.out.println("Total marks :- "+total);
        System.out.println("Average marks :- "+average);
        System.out.println("Percentage :- "+Percentage);
       }
    }
    
    }
