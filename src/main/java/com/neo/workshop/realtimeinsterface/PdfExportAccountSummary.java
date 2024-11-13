package com.neo.workshop.realtimeinsterface;

public class PdfExportAccountSummary implements ExportAccountSummary{

    @Override
    public String export(AccountSummary accountSummary) {

        System.out.println("    Export to Pdf is done"+i);
        return "Data exported to PDF is done";
    }

}
