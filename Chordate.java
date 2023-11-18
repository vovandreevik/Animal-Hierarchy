abstract public class Chordate {
    private final String animal;
    protected Chordate(String animal) {this.animal = animal; }

    @Override
    public String toString(){ return animal; }
}
