package chapter06.b.open_close_violation;

public class A {
    public void execA() {

    }
}

class B {
    public void execB() {
        new A().execA();
    }
}

class C {
    public void execC() {
        new B().execB();
    }

}

class Ax extends A {
    public void execA() {
//        throw new IllegalAccessException();
    }
}
