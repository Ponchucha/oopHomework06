
import java.util.List;

public class PrintReport implements Printers{

    public void output(List<ReportItem> items) {
        System.out.println("Output to console");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

}
