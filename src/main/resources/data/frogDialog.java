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
                return "Please help me catch the bugs! I'm counting on you! You can see a bug overview by clicking on the book in the left and there's a counter on the top right of the page.\n";
            case BUG1:
                return "Butterflies often symbolize the start of a NEW LIFE.  (the hint being new life = new line). \n";
            case BUG2:
                return "Wait, deja vu? Sometimes my thoughts feel like they're just going around in circles, just like when these little guys get lost! Although an ant circle is a sign of imminent death… \n";
            case BUG3:
                return "With over 350000 known species, beetles are the largest group of insects on earth. And yet a lone beetle itself is not omnipresent. Our missing beetle friend is actually pretty illogical!  \n";
            case BUG4:
                return "Dragonflies are amazing flyers. Their muscles are attached directly to their wings which allows them to fly faster than other insects. This also helps them be one of the most accurate hunters as they can fly forward, backward, and upside-down. They can also hover and pivot in place! If I was a dragonfly I think I would be putting the wing in the mouth a lot, so to speak. \n";
            case BUG5:
                return "The Dead Leaf Mantis, or Deroplatys desiccata, is a large mantis from Malaysia that is camouflaged as a dead leaf. Shame it doesn't taste like one… \n";
            case BUG6:
                return "Snails sure do take their time getting around places! So do you it seems - or wait, is that you or me? Time is rather relative! Or maybe we're running along the wrong frame of reference?  \n";
            default:
                return "Please help me catch the bugs! I'm counting on you! \n";
        }
    }
}