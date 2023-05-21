import java.io.FileWriter;
import java.io.IOException;

public class OrderSaver {
    private Order order;

    public OrderSaver(Order order){
        this.order = order;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void SaveToXML(){
        String fileName = "order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<xml>\n<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<ORDER>");
            writer.write("<CLIENT_NAME>"+ order.getClientName() + "</CLIENT_NAME>\n");
            writer.write("<PRODUCT>"+order.getProduct()+"</PRODUCT>\n");
            writer.write("<QNT>"+order.getQnt()+"</QNT>\n");
            writer.write("<PRICE>"+order.getPrice()+"</PRICE>\n");
            writer.write("</ORDER>\n");
            writer.write("</xml>");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
