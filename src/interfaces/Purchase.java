package interfaces;

public interface Purchase {
    default String getPurchaseInfo(){
        return "Car";
    }
}
