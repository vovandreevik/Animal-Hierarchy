import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class AnimalHierarchy {

    public static void main(String[] args) {
        test1();
        //test2();
        //test3();
    }

    public static void test1() {
        ArrayList<Mammal> srcCollection = new ArrayList<>(List.of(
                new Hedgehog("Еж Жора"),
                new Manul("Манул Аня"),
                new Lynx("Рысь Иван"),
                new Hedgehog("Еж Барсик"),
                new Manul("Манул Петя"),
                new Lynx("Рысь Катя")
        ));

        ArrayList<Hedgehogs> hedgehogCollection = new ArrayList<>();
        ArrayList<Feline> manulCollection = new ArrayList<>();
        ArrayList<Carnivorous> lynxCollection = new ArrayList<>();

        segregate(srcCollection, hedgehogCollection, manulCollection, lynxCollection);
    }

    public static void test2() {
        ArrayList<Carnivorous> srcCollection = new ArrayList<>(List.of(
                new Manul("Манул Аня"),
                new Lynx("Рысь Иван"),
                new Manul("Манул Петя"),
                new Lynx("Рысь Катя")
        ));

        ArrayList<Chordate> hedgehogCollection = new ArrayList<>();
        ArrayList<Manul> manulCollection = new ArrayList<>();
        ArrayList<Feline> lynxCollection = new ArrayList<>();

        segregate(srcCollection, hedgehogCollection, manulCollection, lynxCollection);
    }

    public static void test3() {
        ArrayList<Hedgehogs> srcCollection = new ArrayList<>(List.of(
                new Hedgehog("Еж Жора"),
                new Hedgehog("Еж Барсик")
        ));

        ArrayList<Insectivore> hedgehogCollection = new ArrayList<>();
        ArrayList<Carnivorous> manulCollection = new ArrayList<>();
        ArrayList<Carnivorous> lynxCollection = new ArrayList<>();

        segregate(srcCollection, hedgehogCollection, manulCollection, lynxCollection);
    }

    public static void segregate(Collection<? extends Chordate> srcCollection,
                                 Collection<? super Hedgehog> hedgehogCollection,
                                 Collection<? super Manul> manulCollection,
                                 Collection<? super Lynx> lynxCollection) {
        for (Chordate animal : srcCollection) {
            if (animal instanceof Hedgehog) {
                hedgehogCollection.add((Hedgehog) animal);
            } else if (animal instanceof Manul) {
                manulCollection.add((Manul) animal);
            } else if (animal instanceof Lynx) {
                lynxCollection.add((Lynx) animal);
            }
        }

        System.out.println("Животные: " + formatCollection(srcCollection));
        System.out.println("Ежи: " + formatCollection(hedgehogCollection));
        System.out.println("Манулы: " + formatCollection(manulCollection));
        System.out.println("Рысы: " + formatCollection(lynxCollection));
    }

    private static String formatCollection(Collection<?> collection) {
        return collection.toString().replaceAll("^\\[|]$", "");
    }
}