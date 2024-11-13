package com.neo.workshop.realtimeinsterface;

public class ExcelExportAccountSummary implements  EditExportAccountSummary{
    @Override
    public String export(AccountSummary accountSummary) {


        System.out.println("    Export to excel is done"+i);
        return "Data exported to excel is done";
    }

    public void test(){

    }

    @Override
    public void edit(AccountSummary accountSummary) {
        System.out.println("   edit is  possible with default"+i);
    }
}
