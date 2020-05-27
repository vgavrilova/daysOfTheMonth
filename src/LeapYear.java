public class LeapYear {
    // A method that checks whether the year is a leap year
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        } else  if((year % 4 == 0) && (year % 100 != 0)){
            return true;
        } else return (year % 100 == 0) && (year % 400 == 0);
    }

    // A method returns the number of days in a month
    public static int getDaysInMonth (int month, int year){
        // Validation of the inserted values
        if(month < 1 || month > 12){
            return -1;
        } else if (year < 1 || year > 9999){
            return -1;
        }

        // Getting the boolean value from the method isLeapYear(int year)
        boolean leapYear = isLeapYear(year);


        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            // If it is a leap year a program should return 29 days in February
            // If it is not it should return 28
            case 2:
                if(!leapYear){
                    return 28;
                } else {
                    return 29;
                }
            case 4: case 6: case 9: case 11:
                return 30;
        }

        return -1;


    }
}


// using ternary operator -- Leap Year
/*
public static boolean isLeapYear(int year){

    if(year < 1 || year > 9999)
        return false;

    return (year % 4 == 0) ? (year % 100 != 0 || year % 400 == 0) : false;
}*/
