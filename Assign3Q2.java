public class Assign3Q2 {  
    public static void main(String args[]){
        String currentMonth = "January";
        int numberofdays= 0;

        switch (currentMonth){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
            numberofdays= 31;
            System.out.println( currentMonth+ "=" +numberofdays+ "days!");
                break;
            case "April":
            case "June":
            case "September":
            case "November":   
            numberofdays= 30;
            System.out.println( currentMonth+ "=" +numberofdays+ "days!");
                break;
            case "Febrauary":
            numberofdays= 28;
            System.out.println( currentMonth+ "=" +numberofdays+ "days!");
            break;    
         default:
            System.out.println("Invalid month!");
        }
    }
      
}