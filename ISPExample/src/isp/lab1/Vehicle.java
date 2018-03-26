package src.isp.lab1;
//split workable interface into two interfaces.  Person did not implement any of these methods so it is unnecessary
//for it to override them.
public interface Vehicle {
    public void start();
    public void drive(int distance);
    public void stopByBreaking();
}