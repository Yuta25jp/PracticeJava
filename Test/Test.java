public class Test {
    public static void main(String[] args) {

        //Sample s = new Sample();  ←抽象クラスはnewできません。

        Sample2 s = new Sample2();
        s.hogeA();
        s.hogeB();
    }
}
