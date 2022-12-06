package assignment10;

public interface Main {

    public static void main(String[] args) {

        SList list = new SList<Integer>();
        SListIterator it = list.iterator();
        it.insert(10);   //list-> 10


        it.remove();    //list becomes empty

        int counter = 1;
        while (counter<=5){
            it.insert(counter);
            System.out.println(it.next());
            counter++;
        }


    }
}
