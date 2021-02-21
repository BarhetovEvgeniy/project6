package task6.robots;

import task6.head.EHeads;

import java.util.Random;

public class Robot implements IRobot{

    private NameRobots nameRobots(){
        int i3 = new Random().nextInt(NameRobots.values().length);
        return NameRobots.values()[i3];
    }

    @Override
    public String createrobot() {
        return nameRobots().name();
    }
}
