package CreationalPattern.BuilderPattern;

public class Samsung extends Company {
    @Override
    public String pack() {
        return "GalaxyJ7";
    }

    @Override
    public int price() {
        return 12000;
    }
}
