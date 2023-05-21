

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class PrintReport3 implements Printers{
    String path;
    public PrintReport3(String path){
        this.path = path;
    }

    public void output (List<ReportItem> items) {
        String result = "";
        result += "Report is ready: \n";
        for (ReportItem item : items) {
            result += String.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
        File file = new File(path);
        try {
        FileWriter writer = new FileWriter (file, false);   
        if(file.createNewFile()){
            System.out.println("New report file is created.");
        }
        else{
            writer.write(result);   
            writer.close();  
            System.out.println("Report is successfully saved to file " + path);
        } 
        } catch (Exception e) {
            System.out.println("Unable to save report to file");
        }
    }

}
