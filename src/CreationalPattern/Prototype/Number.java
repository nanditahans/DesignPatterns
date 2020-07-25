package CreationalPattern.Prototype;

public class Number implements Prototype {
    private int num;

    public Number() {
        System.out.println("Enter number");
    }

    public Number(int num) {
        this.num = num;
    }

    public void getNum() {
        System.out.println("num is"+num);
    }

    @Override
    public Number getClone() {
        return new Number(num);
    }
}
