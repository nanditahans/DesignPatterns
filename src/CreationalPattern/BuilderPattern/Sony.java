package CreationalPattern.BuilderPattern;

public class Sony extends Company {
    @Override
    public String pack() {
        return "BRAVIA";
    }

    @Override
    public int price() {
        return 400000;
    }
}
