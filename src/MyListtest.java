public class MyListtest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3, 4);
        myList.add(5);
        myList.print();

        System.out.println();
        System.out.println(myList.get(0));
        System.out.println(myList.indexOf(5));
        myList.clear();
        myList.print();

    }
}
