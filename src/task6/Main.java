package task6;

import task6.body.PlantBody;
import task6.head.PlantHead;
import task6.robots.Robot;

import java.util.Arrays;

public class Main {


    public static void main(String[] args){

        for(int c=0;c<4;c++) {

        Robot robotName = new Robot();
        String name = robotName.createrobot();
        //name of robot

        PlantBody bodyOfRobot = new PlantBody();
        String body = bodyOfRobot.createbody();
        //body type of robot

        PlantHead headOfRobot = new PlantHead();
        String head = headOfRobot.createhead();
        //head of robot

            String[] robot = new String[]{name, head, body};
            System.out.println(Arrays.toString(robot));
        }





    }
}
