package main.resources.data;

import main.java.Flag;

public class bugcollectionDialog {
    public static String[] getDialog(Flag flag) {
        switch (flag) {
            case TUTORIAL:
                return new String[]{
                    "Welcome to the bug collection frame! Here you can see all the bugs we've found so far. \n",
                    "You can click on the bugs to see more information about them. \n",
                    "You can also click on the frog to go back to the main frame. \n"};
            case BUG1:
                return new String[]{
                    "Fun fact! Bugs caused by newline characters are one of the hardest to find with print statements, since the \\n is never printed unless you use an extra backslash to create a literal, like this: \\\\n. \n"
                };
            case BUG2:
                return new String[]{
                    "TO DO: Add bug 2 dialog here\n"
                };
            case BUG3:
                return new String[]{
                    "TO DO: Add bug 3 dialog here\n"
                };
            case BUG4:
                return new String[]{
                    "TO DO: Add bug 4 dialog here\n"
                };
            case BUG5:
                return new String[]{
                    "TO DO: Add bug 5 dialog here\n"
                };
            case BUG6:
                return new String[]{
                    "TO DO: Add bug 6 dialog here\n"
                };
            default:
                return new String[]{
                    "OH MY FROG OH NO! If you're seeing this text - something has gone incredibly wrong! Get a demontrator in to look at your code. \n"
                };
        }
    }
}
