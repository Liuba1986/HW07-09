package org.example.HomeTask1_2;

public class Task1 {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk=false;

        if (isWeekend == true && isRain == false) {
            canWalk=true;


            System.out.println("Можно гулять на улице. "+canWalk);

        } else
            System.out.println("Остантесь дома "+ canWalk);
    }

}




