package CreationalPattern.BuilderPattern;

public class Builder {
    public ProductType buildSonyProduct(){
        ProductType productTypes=new ProductType();
        productTypes.addItem(new Sony());
        return productTypes;
    }
    public ProductType buildSamsungProduct(){
        ProductType productTypes=new ProductType();
        productTypes.addItem(new Samsung());
        return productTypes;
    }
}
