package service;

public class PriceService {

    private TaxService taxService;

    private DeliverService deliverService;

    public PriceService(TaxService taxService, DeliverService deliverService) {
        this.taxService = taxService;
        this.deliverService = deliverService;
    }

    public double calculateFinalPrice(double cost, String state){
        return cost + taxService.calculateTax(cost) + deliverService.calculateDeliverPrice(state);
    }
}
