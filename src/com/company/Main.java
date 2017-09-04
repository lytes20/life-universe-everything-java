package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        ReadFile r = new ReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }


    static class ReadFile{
        private Scanner myScanner;
        public void openFile(){
            try{
                myScanner = new Scanner(new File("/Users/gideon_bamuleseyo/IdeaProjects/SpojOne/src/com/company/input.txt"));
            }catch (Exception e){
                System.out.println("File doesn't exist");
            }
        }

        public void readFile(){

            while (myScanner.hasNext()) {

                String number = myScanner.next();
                if (number.trim().equals("42"))
                    break;

                System.out.printf("%s \n", number);


            }
        }

        public void closeFile(){
            myScanner.close();
        }

    }
}


