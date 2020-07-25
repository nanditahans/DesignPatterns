package CreationalPattern.BuilderPattern;

public class Demo {
    public static void main(String[] args) {
        Builder builder=new Builder();
        ProductType productType=builder.buildSonyProduct();
        productType.showItems();

        Builder builder1=new Builder();
        ProductType productType1=builder.buildSamsungProduct();
        productType1.showItems();
    }

}
