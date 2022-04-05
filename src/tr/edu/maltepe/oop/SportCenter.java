package tr.edu.maltepe.oop;

import java.util.ArrayList;

public class SportCenter {

    static ArrayList<String> members;

    public SportCenter() {

        members = new ArrayList<String>();
    }
    public void addMembers(String name){
        members.add(name);
    }
    public ArrayList<String> printMembers(){
        System.out.println(members + " is in sport center");

        return members;
    }

    String footballStadium;
    String swimmingPoll;



}