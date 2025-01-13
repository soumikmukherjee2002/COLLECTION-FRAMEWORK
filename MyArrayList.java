import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[]args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list); // [10, 20, 30, 40, 50]

        ArrayList<String> stlist1 = new ArrayList<>();

        stlist1.add("Soumik");
        stlist1.add("Jack");
        stlist1.add("om");

        System.out.println(stlist1); // [Soumik, Jack, om]

        ArrayList<String> stlist2 = new ArrayList<>();


        stlist2.add("raja");
        stlist2.add("devi");
        stlist2.add("kiran");

        stlist1.addAll(stlist2);
        System.out.println(stlist1); // [Soumik, Jack, om, raja, devi, kiran]

        System.out.println("Show index value : "+ list.get(0)); //Show index value : 10
        list.remove(1);
       //list.remove(Integer.valueOf(30)); // remove the element
        System.out.println(list); // [10, 30, 40, 50]

        list.set(1,100);

        System.out.println(list); // [10, 100, 40, 50]

        for(Integer om : list){
            System.out.println(om); // 10 // 100 // 40 // 50
        }

      //  list.clear(); // remove all arraylist(empty)
    }
}
