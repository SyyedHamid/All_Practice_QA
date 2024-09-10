import org.w3c.dom.ls.LSOutput;

public class LearnSingleTon {

    //Create a private Constructor
    private LearnSingleTon() {
        System.out.println("We Learning Singleton Concept");
    }

    // Step: Create a private static object
    private static LearnSingleTon singleton = new LearnSingleTon();

//Create a public static return type method and return the object

    public static LearnSingleTon getsingleton() {
        return singleton;
    }
}