/*
 switch…case construct
    The switch case construct allows for a concise and efficient selection of code blocks based on the value of a variable. 
    It is commonly used when there are multiple conditions to be evaluated against the same variable. 
    It evaluates an expression and executes code blocks based on matching cases:

    switch (expression) {
      case value1:
           // code block to execute if expression matches value1
          break;
      case value2:
           // code block to execute if expression matches value2
           break;
       default:
          // code block to execute if no cases match
   }
 */

public class SwitchExample {
   public static void main(String[] args) {
        int dayOfWeek=3;
        String day;

        switch (dayOfWeek) {
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Invalid Day of the Week";
                break;
        }
        System.out.println("Day is : "+day);
   } 
}

/*
    The switch statement evaluates the value of dayOfWeek and executes the corresponding case. 
    Each case statement represents a possible value of the variable dayOfWeek. 
    If the value matches the case, the code block associated with that case is executed. 
    In this example, if dayOfWeek is 1, then the variable dayName is assigned the value "Monday", 
    and the break statement terminates the switch statement. 
    The default case is executed when none of the case values match the value of the variable being switched (dayOfWeek in this case). 
    It acts as a fallback option. If dayOfWeek does not match any of the defined cases (1 to 7), 
    dayName is assigned the value "Invalid day". The break statement ends the switch statement.
 */