package behavioural.command.recievers;

public class Fan {
    static int HIGH = 3, MEDIUM = 2, LOW = 1, OFF = 0;
    int speed = OFF;

        public void start() {
            if(speed != 3) {
                speed+=1;
                System.out.println("Fan Started at speed.."+ speed );
            }
            else {
                System.out.println("Fan Started at speed.."+ speed );
            }
        }

       public void stop() {
            speed = 0;
            System.out.println("Fan stopped..");
        }

        public int getSpeed(){
            return speed;
        }
}
