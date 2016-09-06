public class Hotel{
  public static void main(String[] args){
    String season = "summer";
    String dayOfWeek = "weekend";

    boolean summer = season == "summer";
    boolean weekend = dayOfWeek == "weekend";

    if (summer && weekend){
      System.out.println("Your stay is probably going to be pretty expensive. It's both peak travel season AND weekend.");
    }else if (summer || weekend){
      System.out.println("Your stay is probably going to be pretty expensive.");
    }else{
      System.out.println("Your stay may be costly, but it could certainly be worse!");
    }
  }
}
