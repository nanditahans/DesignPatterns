package CreationalPattern.AbstractFactoryPattern;

public class Factory {

    public static AbstractFactory getShapeType(boolean rounded){
        if(rounded){
            return new RoundedFigure();
        }
        else
        {
            return new PlainFigure();
        }
    }
}
