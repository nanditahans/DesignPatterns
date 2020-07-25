package CreationalPattern.Prototype;

public class Demo {

    public static void main(String[] args) {
        Number num=new Number(12);
        num.getNum();
        Number num1=(Number)num.getClone();
        num.getNum();
    }

}
