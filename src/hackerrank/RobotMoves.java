package hackerrank;

import java.util.Scanner;

class Robot {

     int currentX;
     int currentY;
     int previousX;
     int previousY;

     int lastMove = -1;
     int lastMoveVal = 0;

     Robot(){
         currentX = 0;
         currentY   = 5;
     }
     Robot(int x,int y){
         this.previousX = 0;
         this.previousY = 5;
         this.currentX = x;
         this.currentY = y;

     }

     void moveX(int dx){
         this.previousX = this.currentX;
         this.currentX = this.currentX+dx;
         lastMove = 0; //x
         lastMoveVal = dx;
     }
     void moveY(int dy){
         this.previousY = this.currentY;
         this.currentY = this.currentY+dy;
         lastMove = 1; //y
         lastMoveVal = dy;
     }

     void printCurrentCoordinates(){
         System.out.println(this.currentX+" "+this.currentY);
     }

     void printLastCoordinates(){
        if(lastMove == 0){
         System.out.println(this.previousX+" "+this.currentY);
        }
        else if(lastMove == 1){
            System.out.println(this.currentX+" "+this.previousY);
        }
        }


     void printLastMove(){
        if(this.lastMove == 0){
            System.out.println("x "+this.lastMoveVal);
        }
        else if(this.lastMove == 1){
            System.out.println("y "+this.lastMoveVal);
        }

     }
}
public class RobotMoves {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 2;//scan.nextInt();
        int y = 1;//scan.nextInt();
        int dx = 1;//scan.nextInt();
        int dy = 1;//scan.nextInt();

        Robot firstRobot = new Robot();
        firstRobot.printCurrentCoordinates();

        Robot secondRobot = new Robot(x, y);
        secondRobot.printCurrentCoordinates();

        for (int i = 1; i < 3; i++) {
            secondRobot.moveX(dx);
            secondRobot.printLastMove();
            secondRobot.printCurrentCoordinates();
            secondRobot.moveY(dy);
            secondRobot.printLastCoordinates();

            dx += i * i;
            dy -= i * i;
        }
    }
}