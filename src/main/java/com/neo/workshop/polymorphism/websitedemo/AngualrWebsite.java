package com.neo.workshop.polymorphism.websitedemo;

public    class AngualrWebsite implements Website {

    public int i =10;

    protected   String url;
    public AngualrWebsite(String pageUrl){
        this.url = pageUrl;
    }

    @Override
    public String header(){

        return "header";
    }

    @Override
    public String footer(){
        return "footer";
    }



    public  String body(){
        System.out.println(" body from super class");
        return "body from super";
    }


    public String page(){
        StringBuilder builder = new StringBuilder();
        builder.append(header());
        builder.append(body());
        builder.append(footer());
        return builder.toString();

    }
}
