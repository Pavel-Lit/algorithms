import java.util.ArrayList;
import java.util.Random;

public class MyRand {
    private NotebookManufacture[] mn = NotebookManufacture.values();


    public Notebook randNotebook(){

        Notebook notebook = new Notebook(randManufature(),rndNumber(rangeWithStep(4,32,4)), rndNumber(rangeWithStep(500,3000,50)));
        return notebook;
    }

    private Enum randManufature(){
       int manRnd = (int) (Math.random() * 4);
//        String randManufacture = mn[manRnd].toString();

//        return randManufacture;
        return mn[manRnd];
    }

    private  ArrayList<Integer> rangeWithStep(int min, int max, int step){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i < max+1 ; i=i+step) {
            list.add(i);
        }
        return list;
    }

    private  int rndNumber(ArrayList<Integer> list){
        return list.get((int) (Math.random()* list.size()));
    }
}
