import java.util.*;

/*
@version 0.1
-still need to add:
-money total outputs at each step
-remove profanity
-add outputs of what you've ordered
-add payment menu (credit card info, etc)
-save stuff to a file?
-add ability to select multiple things
*/
class Main {
  public static void main(String[] args) {
    moneyStuff totalDue = new moneyStuff();
    Scanner input = new Scanner(System.in);
    ArrayList<String> pizza = new ArrayList<String>();
    System.out.println("welcome to generic slightly racist pizza shop!");
    System.out.println("To start your order, press enter.");
    wait(690);
    System.out.println(
        "If at any time you would like to start over, press the CTRL and C buttons on your keyboard at the same time, then restart the ordering program. our programmer is an 18-year-old crackhead, don't judge us.");
    System.out
        .println("He said it would be fine but I don't personally think this is fine at all. Why do we have to do thi");
    // make that work somehow
    int sizeSelection = 0;
    int gate1 = 0;
    String sizeString = "null";
    do {
      System.out.println("1.Small-$4, 2. Medium- $6, 3.Large- $9, 4. Obese American-$14.");
      System.out.println("please enter a number.");
      if (input.hasNextInt()) {
        sizeSelection = input.nextInt();
      } else {
        input.next();
        continue;
      }

      switch (sizeSelection) {
      case 1:
        sizeString = "Small";
        totalDue.total(4);
        break;
      case 2:
        sizeString = "Medium";
        totalDue.total(6);
        break;
      case 3:
        sizeString = "Large";
        totalDue.total(9);

        break;
      case 4:
        sizeString = "Obese American";
        totalDue.total(14);
        break;
      }
      if (sizeSelection > 4 || sizeSelection < 1) {
        gate1 = 1;
      } else {
        gate1 = 0;
      }
      System.out.println("You have selected " + sizeString);
    } while (gate1 == 1);
    System.out.println("Now let's make your pizza a pizza~!");
    wait(690);
    // add do loop
    int option = 0;
    do {
      System.out.println("CUSTOMISATION MENU:");
      wait(420);
      System.out.println("OPTIONS : 1 - Crust, 2 - Cheese, 3 - Meat, 4 - Veggies");
      wait(420);
      System.out.println("Enter 5 to finish your order.");

      if (input.hasNextInt()) {
        option = input.nextInt();
      } else {
        input.next();
        continue;
      }
      switch (option) {
      case 1:
        System.out.println("Pick a crust type.");
        System.out.println();
        System.out.println("Regular- no extra charge, Thicc + $2.00 , Thin crust +$0.50, Gluten Free +$3.00");
        System.out.println("1-Regular, 2-Thicc, 3-Thin Crust, 4-Gluten Free.");
        wait(420);
        System.out.println("Enter a number and press enter.");
        int crustSelection;
        if (input.hasNextInt()) {
          crustSelection = input.nextInt();
        } else {
          input.next();
          continue;
        }
        String crustType;
        // add extraneous number prevention
        // add print statements to print current total at every step (if you feel like
        // it)
        switch (crustSelection) {
        case 1:
          crustType = "Regular";
          continue;

        case 2:
          crustType = "Thicc";
          totalDue.total(2);
          continue;
        case 3:
          crustType = "Thin Crust";
          totalDue.total(0.5);
          continue;
        case 4:
          crustType = "Gluten Free";
          totalDue.total(3);
          continue;
        // possibly add default if extraneous number prevention doesnt like an if
        // statement or you're being lazy
        }
      case 2:
        System.out.println("Pick a cheese.");
        System.out.println();
        System.out.println(
            "Mozzarella- no extra charge, Provolone + $0.25 , Havarti +$0.50, Dairy Free (Daiya Brand) +$1.00");
        System.out.println("1 - Mozzarella, 2 - Provolone, 3 - Havarti, 4 - Dairy Free (Daiya Brand).");
        wait(420);
        System.out.println("Enter a number and press enter.");
        int cheeseSelection;
        if (input.hasNextInt()) {
          cheeseSelection = input.nextInt();
        } else {
          input.next();
          continue;
        }
        String cheeseType;
        // add extraneous number prevention
        // add print statements to print current total at every step (if you feel like
        // it)
        switch (cheeseSelection) {
        case 1:
          cheeseType = "Mozzarella";
          continue;
        case 2:
          cheeseType = "Provolone";
          totalDue.total(0.25);
          continue;
        case 3:
          cheeseType = "Havarti";
          totalDue.total(0.5);
          continue;
        case 4:
          cheeseType = "Dairy Free (Daiya Brand)";
          totalDue.total(1);
          continue;
        // possibly add default if extraneous number prevention doesnt like an if
        // statement or you're being lazy
        }
      case 3:
        System.out.println("Pick a meat.");
        System.out.println();
        System.out.println(
            "Pepperoni- no extra charge, Sausage + $0.50 , Bacon +$0.69, bacon from canada + $1.00, no meat - no extra charge.");
        System.out.println("1 - Pepperoni, 2 - Sausage, 3 - bacon, 4 -bacon from canada, 5 - no meat.");
        wait(420);
        System.out.println("Enter a number and press enter.");
        int meatSelection;
        if (input.hasNextInt()) {
          meatSelection = input.nextInt();
        } else {
          input.next();
          continue;
        }
        String meatType;
        // add extraneous number prevention
        // add print statements to print current total at every step (if you feel like
        // it)
        switch (meatSelection) {
        case 1:
          meatType = "Pepperoni";
          continue;
        case 2:
          meatType = "Sausage";
          totalDue.total(0.5);
          continue;
        case 3:
          meatType = "bacon";
          totalDue.total(0.69);
          continue;
        case 4:
          meatType = "bacon from canada";
          totalDue.total(1);
          continue;
        case 5:
          meatType = "no meat";
          continue;
        // possibly add default if extraneous number prevention doesnt like an if
        // statement or you're being lazy
        }
      case 4:
        System.out.println("Pick vegetables.");
        System.out.println();
        System.out.println(
            "vegetables are no extra charge. we still hate you for pushing veganism onto people that want to eat their burger in peace.");
        wait(690);
        System.out.println(
            "1 - Mushrooms, 2 - Roma Tomatoes, 3 - Olives, 4 - Green Bell Peppers, 5 - artichokes, 6 - no vegetables");
        wait(420);
        System.out.println("Enter a number and press enter.");
        int vegSelection;
        if (input.hasNextInt()) {
          vegSelection = input.nextInt();
        } else {
          input.next();
          continue;
        }
        String vegType;
        // add extraneous number prevention
        // add print statements to print current total at every step (if you feel like
        // it)
        switch (vegSelection) {
        case 1:
          vegType = "mushroom";
          continue;
        case 2:
          vegType = "roma tomatoes";
          continue;
        case 3:
          vegType = "olives";
          continue;
        case 4:
          vegType = "green bell peppers";
          continue;
        case 5:
          vegType = "artichokes";
          continue;
        // possibly add default if extraneous number prevention doesnt like an if
        // statement or you're being lazy
        case 6:
          vegType = "no vegetables";
          continue;
        }
      case 5:
        System.out.println("Thank you!");
        System.out.println("Your total is: " + totalDue.total(0));
        break;
      }
    } while (option != 5);
  }

  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}