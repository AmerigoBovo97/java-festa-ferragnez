package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args){
        String[] guests = {
            "Dua Lipa",
            "Paris Hilton",
            "Manuel Agnelli",
            "J-Ax",
            "Francesco Totti",
            "Ilary Blasi",
            "Bebe Vio",
            "Luis",
            "Pardis Zarei",
            "Martina Maccherone",
            "Rachel Zeilic"
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Dimmi come ti chiami");
        String guestName = input.nextLine();
        input.close();

        boolean isGuest = false;
        int guestsLength = guests.length;
        for (int i = 0; i < guestsLength; i++){
            if (guestName.equals(guests[i])){
                isGuest = true;
                break;
            }
        }
        if (isGuest){
            System.out.println("Ok dai per questa volta ti lascio entrare... ma ti tendo d'occhio!!");
        } else {
            System.out.println("Maledetto volevi imbucarti?? Ti conviene scappare!!");
        }

        isGuest = false;
        int index = 0;
        while (index < guestsLength) {
            if (guestName.equals(guests[index])){
                isGuest = true;
                break;
            }else{
                index ++;
            }
        }

        if (isGuest){
            System.out.println("Ok dai per questa volta ti lascio entrare... ma ti tendo d'occhio!!");
        } else {
            System.out.println("Maledetto volevi imbucarti?? Ti conviene scappare!!");
        }
    }
}