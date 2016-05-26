package fast.led.pkgswitch;

import java.awt.AWTException;
import java.awt.Robot;

public class FastLEDSwitch {
    public static void main(String[] args) throws AWTException {
        Robot presser = new Robot();
        presser.keyPress(145);
        presser.keyRelease(145);
    }  
}
