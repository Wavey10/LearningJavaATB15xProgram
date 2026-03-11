package OOPS_Lab003.Intermediate;

public class ex_03 {

    public static void main(String[] args) {

        Report report = new PDFReport();
        report.generate();
        report = new ExcelReport();
        report.generate();

    }
}

class Report
{
    void generate()
    {
        System.out.println("Report generating");
    }
}

class PDFReport extends Report
{
    void  generate()
    {
        System.out.println("PDF report generating");
    }
}

class ExcelReport extends Report
{
    void generate()
    {
        System.out.println("Excel Report generating");
    }
}
