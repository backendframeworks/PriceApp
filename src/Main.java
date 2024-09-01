import service.DeliverService;
import service.PriceService;
import service.TaxService;

public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        DeliverService deliverService = new DeliverService();

        PriceService priceService = new PriceService(taxService, deliverService);

        System.out.print("O preço final é: " + priceService.calculateFinalPrice(100, "SP"));
    }
}