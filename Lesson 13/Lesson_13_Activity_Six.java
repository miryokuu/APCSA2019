import java.util.Scanner;

class Lesson_13_Activity_Six {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float temp = input.nextFloat();
        
        if(temp >= 99 && temp <= 102){
          System.out.println("Temperatrue is OK");
        }else{
          System.out.println("WARNING");
        }
        input.close();
    }
}
