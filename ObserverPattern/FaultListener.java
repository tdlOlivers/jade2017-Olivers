package ObserverPattern;


public interface FaultListener{
    void faultEvent(Fault fault, String msg);
}
