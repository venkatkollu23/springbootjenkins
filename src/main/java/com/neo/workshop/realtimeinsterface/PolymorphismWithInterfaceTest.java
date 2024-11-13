package com.neo.workshop.realtimeinsterface;

public class PolymorphismWithInterfaceTest {

    public static void main(String[] args){
        ExportAccountSummary excelExportAccountSummary  = new ExcelExportAccountSummary();

        excelExportAccountSummary.export(new AccountSummary());


        ExportAccountSummary pdfExportAccountSummary  = new PdfExportAccountSummary();

        pdfExportAccountSummary.export(new AccountSummary());



    }
}
