import java.io.Console;
import java.util.ArrayList;

public class App {
    public static void main( String[] args){
        Console console = System.console();

        System.out.println("I am a PinPong application,You can play with any number you need");
        System.out.println("Enter a number");
        String stringUserNumber = console.readLine();
        int intUserNumber =Integer.parseInt(stringUserNumber);
        PingPong pingPong = new PingPong();
        ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
        System.out.println(pingPongResult);
    }
}
