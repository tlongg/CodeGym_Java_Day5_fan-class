public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(1);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("yellow");
        fan2.setOn(false);


        System.out.println("Fan 1 information are: " + fan1);
        System.out.println("Fan 2 information are: " + fan2);
    }
}
