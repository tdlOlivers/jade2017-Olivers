package ObserverPattern;

public class Fault{
    private int type_;
    public Fault(int type){
        type_ = type;
    }

    public int getType(){
        return type_;
    }
}