import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    Computer laptop = new Computer(2000, "lenovo", "XL123", 400, 300);

    Computer desktop = new Computer(2010, "HP", "Boombox", 1000, 1000);

    Computer gamingDesktop = new Computer(2016, "Alienware", "killer", 2000, 3000);

    Computer premiumDesktop = new Computer(1990, "IBM", "Box1", 4000, 200);

    Computer[] allComputer = {laptop, desktop, gamingDesktop, premiumDesktop};

    System.out.println("All Computer");
      for (Computer individualComputer: allComputer){
        System.out.println("_________________________");
        System.out.println(individualComputer.mYear);
        System.out.println(individualComputer.mBrand);
        System.out.println(individualComputer.mModel);
        System.out.println(individualComputer.mPrice);
        System.out.println(individualComputer.mRam);
      }

    System.out.println("What is the maximum budget for a computer?");
    String stringUserMaxBudget = myConsole.readLine();
    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

    System.out.println("Alright, here's what we have in your price range?");

    for ( Computer individualComputer : allComputer ) {
      if (individualComputer.worthBuying(userMaxBudget)) {
        System.out.println("---------------------");
        System.out.println( individualComputer.mYear );
        System.out.println( individualComputer.mBrand );
        System.out.println( individualComputer.mModel );
        System.out.println( individualComputer.mPrice );
        System.out.println( individualComputer.mRam );
      }
    }
  }
}
