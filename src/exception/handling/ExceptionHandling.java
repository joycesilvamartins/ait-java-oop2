package exception.handling;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {

//        System.out.println(testMethodA());
//        System.out.println(testMethodB());
//        System.out.println(testMethodC());
//        System.out.println(testMethodD());
//       System.out.println(testMethodE());
        try {
            testMethodF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 2.
        A a = new B();
        try {
            // the exceptions caught here are defined at compile time by
            // the type of 'a' i.e. 'A'
            a.process();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // 3.
        try {
            X1();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        // 4.
        Y1();   // compiles        
//        try{
//            Y1();
//        } catch (RuntimeException ex) {
//            ex.printStackTrace();
//        }
//        a();

    }

    public static String testMethodA() {
        /*Output
            finally section...
            ok from finally
         */
        try {
            int x = 9;
        } catch (Exception e) {
            System.out.println("Exception occured ");
            return "exception";
        } finally {
            System.out.println("finally section...");
            // return from finally block
            // if I comment out line below, I get a "missing return statement" compiler error
            return "ok from finally";
        }
        //return "normal"; unreachable (unless return in finally is commented out)

    }

    public static String testMethodB() {
        /*Output
            finally section...
            ok 
         */
        try {
            //return from try block
            return "ok";//"finally section..." is printed
        } catch (Exception e) {
            System.out.println("Exception occured ");
            return "exception";
        } finally {
            System.out.println("finally section...");
            //return "from finally"; if this is present, "from finally" replace "ok"    
        }
    }

    public static String testMethodC() {
        /* Output
                Exception occured : java.lang.Exception
                finally section...
                exception
         */
        try {
            throw new Exception();//BAD CODING - throwing an exception when there is no error!
        } catch (Exception e) {
            System.out.println("Exception occured " + e.toString());
            //return from exception block
            return "exception";
        } finally {
            System.out.println("finally section...");
        }
    }

    public static String testMethodD() {
        /*
         * This will not compile as the *checked* exception IOException is never thrown 
         * in body of corresponding try statement".
         * If I change it to catching "Exception" it will compile as there are *unchecked* exceptions
         * that are subclasses of Exception that could be thrown by the system e.g. IndexOutOfBoundsException
         */
        try {
            return "ok";
//        } catch(IOException e){ // error "never thrown in try block..."
//        } catch(NoSuchMethodException e){ // error "never thrown in try block..."
//        } catch(ClassNotFoundException e){ // error "never thrown in try block..."
//        } catch(Exception e){  //ok
        } catch (RuntimeException e) {
            System.out.println("Exception occured " + e.toString());
            return "IOException";
        }
    }

    public static String testMethodE() {
        /* Output
            Exception occured : java.lang.ArrayIndexOutOfBoundsException: 55
            finally section...
            ok from finally
         */
        try {
            String names[] = {"John", "Peter"};
            names[55] = "Jack";
            return "ok";
//      } catch(IOException e){
        } catch (Exception e) {
            System.out.println("Exception occured " + e.toString());
            return "exception";

        } finally {
            System.out.println("finally section...");
            return "ok from finally";
        }
    }

    public static void testMethodF() throws Exception {

    }

    // In this example, the nested X4() method throws a *checked* exception and therefore all methods in the 
    // stack trace must declare that they are throwing it until we reach a method (main() in this example)
    // that can handle it.
    public static void X1() throws ClassNotFoundException {
        X2();
    }

    public static void X2() throws ClassNotFoundException {
        X3();
    }

    public static void X3() throws ClassNotFoundException {
        X4();
    }

    public static void X4() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    // In this example, the nexted method Y4() throws an *unchecked* RuntimeException. Note that none of the
    // methods until main() needed to catch the exception of declare in their signatures that they were throwing
    // it - this can lead to more succinct code
    public static void Y1() {
        Y2();
    }

    public static void Y2() {
        Y3();
    }

    public static void Y3() {
        Y4();
    }

    public static void Y4() {
        throw new RuntimeException();
    }

    public static void a() {
        b();
    }

    public static void b() {
        try {
            c();
        } catch (MyException e) {
            System.out.println("Caught MyException...");
            System.out.println("The original exception was: " + e.getCause().toString());
        }
    }

    public static void c() throws MyException {
        try {
            throw new IOException("An I/O exception occurred.");
        } catch (IOException ioe) {
            throw new MyException(ioe);
        }
    }

}
