public class Homework {
    private static final int SIZE = 10000;

    public static void main(String[] args) {

        Notebook[] arrNotebook = new Notebook[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arrNotebook[i] = new MyRand().randNotebook();

        }
        System.out.println("--------------");
        MySort.fullSort(arrNotebook);

        for (int i = 0; i < arrNotebook.length; i++) {
            System.out.println(i+" "+ arrNotebook[i]);
        }
        System.out.println("--------------");


    }
}
