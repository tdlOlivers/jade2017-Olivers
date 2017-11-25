package ObserverPattern;

import java.util.logging.*;

public class FaultLogger implements FaultListener{
    private static Logger logger = Logger.getLogger("");

    public FaultLogger(FaultMessageGenerator fmg) {
        fmg.addFaultListener(this);
    }
    
    public void faultEvent(Fault fault, String msg) {
        logger.log(Level.WARNING,
        "A " + fault.getType() + " occurred: " + msg);
    }
}
