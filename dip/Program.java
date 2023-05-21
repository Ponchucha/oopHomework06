

public class Program {

    //TODO: (2 задание ) Доработать самостоятельно
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new PrintReport());
        System.out.println();
        report.output(new PrintReport2("My cool Epson printer"));
        System.out.println();
        report.output(new PrintReport3("report.txt"));
    }

}
