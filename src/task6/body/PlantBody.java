package task6.body;

import java.util.Random;

public class PlantBody implements IBodies {
    private EBodies bodyType(){
        int i = new Random().nextInt(EBodies.values().length);
        return EBodies.values()[i];
    }
    //String body = bodyType().toString();
    /* private Letter randomLetter() {
    int pick = new Random().nextInt(Letter.values().length);
    return Letter.values()[pick];
    }
    */

    @Override
    public String createbody() {
        return bodyType().name();
    }




}
