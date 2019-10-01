/*
* Lesson 32 Coding Activity 1
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes a parameter for the number of a month 
* and prints the month's name. 
* 
* This method must be called monthName() and it must have an integer parameter. 
* 
* Calling monthName(8) should print August to the screen.
*/

class Lesson_32_Activity_One {
    public static void monthName(int nMonth)
    {
        String month;
        switch (nMonth)
        {
        case 1:
            month = "January";
            break;
        case 2:
            month = "Febuary";
            break;
        case 3:
            month = "March";
            break;
        case 4:
            month = "April";
            break;
        case 5:
            month = "May";
            break;
        case 6:
            month = "June";
            break;
        case 7:
            month = "July";
            break;
        case 8:
            month = "August";
            break;
        case 9:
            month = "September";
            break;
        case 10:
            month = "October";
            break;
        case 11:
            month = "November";
            break;
        case 12:
            month = "December";
            break;
        default:
            throw new RuntimeException("no");
        }

        System.out.println(month);
    }

    public static void main(String[] args)
    {
        monthName(8);
    }
}
