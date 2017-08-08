import javax.swing.JOptionPane;
import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String args[]){
        int QUARTSTOGALLONS = 4;
        int gal, quarts, quartsNeeded;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("How many quarts are needed?");
        quartsNeeded = inputDevice.nextInt();
        gal = QUARTSTOGALLONS / quartsNeeded;
        quarts = QUARTSTOGALLONS % quartsNeeded;
        if(quarts != 0){
            System.out.println("The job requires " + gal + " Gallons, and " + quarts + " Quarts");
        }
        else {
            System.out.println("The job requires " + gal +" Gallons");
        }
    }

}