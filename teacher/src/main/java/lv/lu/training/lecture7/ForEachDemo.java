package lv.lu.training.lecture7;

public class ForEachDemo {

    public static void main(String[] args) {
        String[] dogBreads = {"Beagle", "GoldenRetriever", "Pug", "ShibaInu" };

        for (String breed : dogBreads) {
            System.out.println(breed);
        }

        for (int i = 0; i < dogBreads.length; i++){
            System.out.println(dogBreads[i]);
        }
    }
}
