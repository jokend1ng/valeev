package Lesson5;

public class Test {
    static class MyException extends Exception{

    }
    static void test() throws MyException{
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        test();
    }
}
