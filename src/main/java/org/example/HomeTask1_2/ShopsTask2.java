package org.example.HomeTask1_2;

public class ShopsTask2 {

    boolean isEdekaOpen = true;  // Если он открыт //
    static boolean isReweOpen = false;  // Если он закрыт //

    public boolean canBuy(){

        return (isEdekaOpen || isReweOpen);
    }
}
