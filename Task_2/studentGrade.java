import java.util.*;
class studentGrade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths, Physics and Chemistry");
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int total = maths+physics+chemistry;
        int avgPer = total/3;
        System.out.println("Total Marks: " + total);
        System.out.println("Averge Percentage: "+ avgPer + "%");
        if(avgPer>=95){
            System.out.println("Grade A");
        }else if(avgPer>=85){
            System.out.println("Grade B");
        }else if(avgPer>=70){
            System.out.println("Grade C");
        }else if(avgPer>=50){
            System.out.println("Grade D");
        }else if(avgPer>=30){
            System.out.println("Grade E");
        }else{
            System.out.println("Grade F");
        }
    }
}