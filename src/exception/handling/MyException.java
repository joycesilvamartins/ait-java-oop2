package exception.handling;

import java.io.IOException;

class MyException extends Exception {

    public MyException() {
    }

    MyException(Throwable cause) {
        super(cause);
    }
}

class A {

    void process() throws IOException {
        throw new IOException();
    }
}

class B extends A {
    // compiler error - "process() in B cannot override process() in A
    //                   overridden method does not throw NoSuchMethodException"
    // To fix:
    //   1. Change A::process() to throw NoSuchMethodException as well as IOException
    //   2. Change A::process() to throw Exception only (this catches all subclasses)
    //   3. Make B::process() throw IOException only
//    void process() throws IOException, NoSuchMethodException {
//    	System.out.println("B");
//    	}
}
