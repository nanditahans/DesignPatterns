package CreationalPattern.AbstractFactoryPattern;

public class RoundedFigure extends AbstractFactory {
    @Override
    Shape getShape(String shapetype) {
        if(shapetype.equalsIgnoreCase("ROUNDEDRECTANGLE")){
            return new RoundedRectangle();
        }
        else if(shapetype.equalsIgnoreCase("ROUNDEDSQUARE")){
            return new RoundedSquare();
        }
            return null;
    }
}
