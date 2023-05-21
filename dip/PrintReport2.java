

import java.util.List;

public class PrintReport2 implements Printers {
    String printerName;

    public PrintReport2(String printerName){
        this.printerName = printerName;
    }

    public void output(List<ReportItem> items) {
        String result = "";
        result += "Report is ready: \n";
        for (ReportItem item : items) {
            result += String.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }

        System.out.printf("\nDocument is sent to printer '%s':\n", printerName);
        System.out.println(result);
    }

}
