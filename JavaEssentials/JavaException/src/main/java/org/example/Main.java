package org.example;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.case1(10, 5);
        main.case2(10, 5);
        main.case1(10, 0);
        main.case2(10, 0);

    }
        public void case1( int x, int y){

            if (y != 0) {
                System.out.println("x/y = " + x / y);
            } else {
                System.out.println("The value of y is 0 , a possible exception");
            }

        }
    public   void case2( int x ,int y){

        try{
            System.out.println("x/y = " + x/y);
        }catch(Exception e ){
            System.out.println("The value of y is 0 , a possible exception" + e);
        }

       // Better ways to understand exception

        try{
            System.out.println("Before Exception");
            System.out.println("The divide by zero exception"+10/0);
            System.out.println("After Exception");
        }catch(Exception e)
        {
            System.out.println("Divide by zero exception");
            System.out.println(e);
            e.printStackTrace();

        }


        // Finally block use
        //Type -1
        int a, b = 0;
        try {
            System.out.println("Before exception");
            a = (b = 10 * 10) / 0; //If there is a subsequent statement  within the exception statement ,that block will be executed.
            System.out.println("After Exception");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println(b);
        }
        // Type -2
        int q =0;
       try{
           System.out.println("Before Exception");
           int p = (q = 10*9)/0;
           System.out.println("After Exception");
       }finally{
           System.out.println(q);
           System.out.println("It is finally block.It has special power");
        }

    }

}






