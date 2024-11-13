package com.neo.workshop.polymorphism.exception;

public class ExceptionTest {

    public void calcualte() {
        try {
          A a =   (A)Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
          a.test();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println(" Exception occurred while calculating "+e.getMessage());
        }
    }

    public void calcualteWithThrows()  throws InstantiationException,IllegalAccessException,ClassNotFoundException{
        try {
            A a =   (A)Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
            a.test();

        }catch (RuntimeException e){
            System.out.println(" Exception occurred while calculating "+e.getMessage());
        }
    }

    public void calcualteWithThrowsRootException()  throws Exception{
        try {
            A a =   (A)Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
            a.test();

        }catch (RuntimeException e){
            System.out.println(" Exception occurred while calculating "+e.getMessage());
        }
    }

    public void calcualteWithThrow()  {
        try {
            A a =   (A)Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
            a.test();

        }catch (Exception e){
            System.out.println(" Exception occurred while calculating "+e.getMessage());
            throw new RuntimeException(" Class loading issue");

        }
    }

    public void calcualteWithCascadeExceptionThrow() throws Exception {
        try {
            A a =   (A)Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
            a.test();

        }catch (Exception e){
            System.out.println(" Exception occurred while calculating "+e.getMessage());
           throw  e;

        }finally {
            System.out.println(" from finally");
        }
    }

    public void calcualteWithfinally(int numberofTicket) throws Exception {
        String status = null;
        try {
            System.out.println(" Available "+PaymentService.seats);

            PaymentService.seats =  PaymentService.seats-numberofTicket;

            System.out.println(" Available "+PaymentService.seats);

            PaymentService  paymentService = new PaymentService();
            status =  paymentService.payment(numberofTicket);

        }finally {
            if (!"SUCCESS".equals(status)){
                PaymentService.seats =  PaymentService.seats+numberofTicket;
            }
            System.out.println(" from finally calcualteWithfinally1111 ");
            System.out.println(" from finally calcualteWithfinally 222222");
            System.out.println(" from finally calcualteWithfinally 333333");
            System.out.println(" post payment Available "+PaymentService.seats);
        }

        System.out.println(" post finally  block");
    }
}
