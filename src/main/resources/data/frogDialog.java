package main.resources.data;

import main.java.Flag;

public class frogDialog {
    public static String[] getDialog(Flag flag) {
        switch (flag) {
            case TUTORIAL:
                return new String[]{"Nice to meet you! I'm Kevin and I need you to help me catch all the bugs loose in this codebase. I'm a frog, so I can't do it myself.",
                    "Let me start by showing you around! I'll be your guide and help you catch all the bugs. You can see a bug overview by clicking on the book in the top left corner.\n", 
                    "There's also a counter on the top left of the page - that shows you what bugs you've caught and how many are left. \n", 
                    "If you're really stuck, talk to your demonstrators and tutors. \n"
                };
            case BUG1:
                return new String[]{"Sorry, what did you say your name was again? I can't seem to find it in my records. Or maybe I just can't remember it. I'm not sure. You should take a look at my log book, it's stored in resources/data/logbook.txt. \n",
                    "Your name is already in there? Well, looks like we have found the first bug!\n",
                    "Here's Hint #1: Butterflies often symbolize the start of a NEW LIFE.\n", 
                    "Here's Hint #2: I like a little bit of word play - by new life, I mean new line. \n",
                    "Here's Hint #3: Think about new line characters and how they can affect the behaviour of if statements. Try putting in break points and checking variables look like you expect them to - particularly when we're checking for your name! \n"
            };
            case BUG2:
                return new String[]{
                    "Here's Hint #1: Wait, deja vu? Sometimes my thoughts feel like they're just going around in circles, just like when these little guys get lost! Although an ant circle is a sign of imminent death… \n"
                };
            case BUG3:
                return new String[]{
                    "With over 350000 known species, beetles are the largest group of insects on earth. And yet a lone beetle itself is not omnipresent. Our missing beetle friend is actually pretty illogical!  \n"
                };
            case BUG4:
                return new String[]{
                    "Here's Hint #1: Dragonflies are amazing flyers. Their muscles are attached directly to their wings which allows them to fly faster than other insects. This also helps them be one of the most accurate hunters as they can fly forward, backward, and upside-down. They can also hover and pivot in place! If I was a dragonfly I think I would be putting the wing in the mouth a lot, so to speak. \n"
                };
            case BUG5:
                return new String[]{
                    "Here's Hint #1: The Dead Leaf Mantis, or Deroplatys desiccata, is a large mantis from Malaysia that is camouflaged as a dead leaf. Shame it doesn't taste like one… \n"
                };
            case BUG6:
                return new String[]{
                    "Here's Hint #1: Snails sure do take their time getting around places! So do you it seems - or wait, is that you or me? Time is rather relative! Or maybe we're running along the wrong frame of reference?  \n"
                };
            default:
                return new String[]{
                    "OH MY FROG OH NO! If you're seeing this text - something has gone incredibly wrong! Get a demontrator in to look at your code. \n"
                };
        }
    }
}