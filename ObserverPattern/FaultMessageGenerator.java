package ObserverPattern;

import java.util.*;
import java.lang.Exception;
import ObserverPattern.FaultListener;

public class FaultMessageGenerator {
    Fault obj_;
    private ArrayList<FaultListener> listeners = new ArrayList<FaultListener>();

    public void addFaultListener(FaultListener listener) {
        listeners.add(listener);
    }

    protected void notify_all(Fault faultObj, String faultMsg) {
        for (FaultListener fl: listeners) {
        fl.faultEvent(faultObj, faultMsg);
        }
    }

    public void faulted(){
        obj_ = new Fault(404);
        notify_all(obj_, "SOMETHING 404 happened");
    }

    public void removeFaultListener(FaultListener listener) {
        listeners.remove(listener);
    }
}
