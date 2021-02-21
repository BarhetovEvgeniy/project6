package task6.head;

import task6.body.EBodies;

import java.util.Random;

public class PlantHead implements IHead{

    private EHeads headType(){
        int i2 = new Random().nextInt(EHeads.values().length);
        return EHeads.values()[i2];
    }

    @Override
    public String createhead() {
        return headType().name();
    }

    //String body = bodyType().toString();
    /* private Letter randomLetter() {
    int pick = new Random().nextInt(Letter.values().length);
    return Letter.values()[pick];
    }
    */
}
