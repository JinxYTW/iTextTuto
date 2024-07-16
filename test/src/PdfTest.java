import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileOutputStream;

public class PdfTest {
    public static void main(String[] args) {
        String pdfPath = "test.pdf";
        try {
            PdfWriter writer = new PdfWriter(new FileOutputStream(pdfPath));
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            document.add(new Paragraph("Hello, World!"));
            document.close();

            System.out.println("PDF generated successfully at " + pdfPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}