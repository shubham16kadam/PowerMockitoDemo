package com.powermockito.demo;

public class Tournament {

    private void register(String teamName) throws Exception {

        // register team
        boolean isRes = isAlreadyRegistered(teamName);
        System.out.println(isRes);
         if(!isRes){
             System.out.println("Registration done");
        }
        else{
            System.out.println("Registered");
        }
    }

    boolean isAlreadyRegistered(String teamName) throws Exception {
        int a = 1/0;
        return false;
    }

    public static void main(String[] args) throws Exception {
        Tournament tournament = new Tournament();
        tournament.register("e-LEMON-ators");
    }
}