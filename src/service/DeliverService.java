package service;

public class DeliverService {

    public double calculateDeliverPrice(String state){
        if("PE".equalsIgnoreCase(state)){
            return 10;
        } else {
            return 20;
        }
    }
}
