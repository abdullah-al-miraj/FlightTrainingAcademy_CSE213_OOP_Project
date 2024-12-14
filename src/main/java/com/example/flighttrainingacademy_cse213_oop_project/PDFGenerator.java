package com.example.flighttrainingacademy_cse213_oop_project;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.scene.control.Alert;

import java.io.FileOutputStream;

class PDFGenerator {
    public static void generatePDF(String technicalIssuesParagraph, String filePath) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath + ".pdf"));
            document.open();
            document.add(new Paragraph("Technical Problems During Flight Simulation"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph(technicalIssuesParagraph));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("PDF saved successfully");
            alert.showAndWait();
        }
        catch (Exception e) {
            System.err.println("Error generating PDF: " + e.getMessage());
        } finally {
            document.close();
        }
    }
}
