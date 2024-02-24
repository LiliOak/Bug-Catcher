package main.resources.data;

enum Flag {
    TUTORIAL,
    BUG1,
    BUG2,
    BUG3,
    BUG4,
    BUG5,
    BUG6
  }

public class frogDialog {
    public static String getDialog(Flag flag) {
        switch (flag) {
            case TUTORIAL:
                return "Please help me catch the bugs! I'm counting on you! \n";
            case BUG1:
                return "You caught the first bug! \n";
            case BUG2:
                return "You caught the second bug! \n";
            case BUG3:
                return "You caught the third bug! \n";
            case BUG4:
                return "You caught the fourth bug! \n";
            case BUG5:
                return "You caught the fifth bug! \n";
            case BUG6:
                return "You caught the sixth bug! \n";
            default:
                return "Please help me catch the bugs! I'm counting on you! \n";
        }
    }