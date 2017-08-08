import java.awt.*;

/**
 * Created by jc243967 on 8/08/17.
 */
public class QuartsToGallons {
    public static void main(String args[]){
        int QUARTSTOGALLONS = 4;
        int QUARTSNEEDED = 18;
        int gal, quarts;
        gal = QUARTSTOGALLONS / QUARTSNEEDED;
        quarts = QUARTSTOGALLONS % QUARTSNEEDED;
        if(quarts != 0){
           System.out.println("The job requires " + gal + " Gallons, and " + quarts + " Quarts");
        }
        else {
            System.out.println("The job requires " + gal +" Gallons");
        }
    }

}
