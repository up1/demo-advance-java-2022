package demo;

public class DemoRecord {

    public static void main(String[] args) {
        Data data = new Data(1, "Somkiat");
    }
}

record Data(int id, String name){

}
