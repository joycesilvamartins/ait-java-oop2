package exercises;

public class EnumTest {
    
    Day day;
    
    public EnumTest (Day day){
        
        this.day = day;
        
    }
    
    public void tellItLikeItIs(){
        
        switch(day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY: 
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are ok.");
                break;
        }
        
    }
    public static void main(String[] args) {
        
        EnumTest et = new EnumTest(Day.MONDAY);
        et.tellItLikeItIs();
        
        et = new EnumTest(Day.WEDNESDAY);
        et.tellItLikeItIs();
        
        et = new EnumTest(Day.SUNDAY);
        et.tellItLikeItIs();
        
        et=new EnumTest(Day.FRIDAY);
        et.tellItLikeItIs();
        
        et = new EnumTest(Day.SATURDAY);
        et.tellItLikeItIs();
      }
   
}
