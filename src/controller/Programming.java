package controller;

import common.Algorithm;
import view.Menu;
import model.Data;

public class Programming extends Menu<String>{
    static String[] mn = {"count letter", "count character", "exit"};
    protected Algorithm algorithm;
    protected String string;

    public Programming(Data data) {
        super("Counting program", mn);
        algorithm = new Algorithm();
        string = data.getString();
    }
    
    @Override
    public void execute(int choice) {
        switch(choice){
            case 1: {
                letterCount();
                break;
            }
            case 2: {
                charCount();
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
        }
    }
    public void letterCount(){
        String str = algorithm.countingLetter(string);
        System.out.println(str);
    }
    
    public void charCount(){
        String str = algorithm.countingChar(string);
        System.out.println(str);
    }
}
