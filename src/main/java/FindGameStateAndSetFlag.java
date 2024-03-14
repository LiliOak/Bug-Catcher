package main.java;

import main.java.Flag;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

/** This is where we check the bugs to see if they've been fixed and update the global flag accordingly. */ 
public class FindGameStateAndSetFlag {
        public static Flag flag = Flag.TUTORIAL;

        
        public void setFlag() {

                ///TODO: BUG 1 check for changes made to the user_data.txt file and use function designed to read the file over in GameManager to see if anything is being stored
                
                try {
                        File myObj = new File("src\\main\\resources\\data\\user_data.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String name = myReader.nextLine();
                            
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    };

                ///TODO: BUG 2 CHECK IF FIXED, this is by reading file as string and seeing if % is + :/
                ///TODO: BUG 3 CHECK IF FIXED, read file and check loop header :/

                this.flag = Flag.TUTORIAL;
        }

}
