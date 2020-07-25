package CreationalPattern.AbstractFactoryPattern;

public class PlainFigure extends AbstractFactory {
    @Override
    public Shape getShape(String shapetype) {
        if(shapetype.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapetype.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
            return null;
    }
}
