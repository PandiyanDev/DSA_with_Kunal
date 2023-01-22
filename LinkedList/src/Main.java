public class Main {
    public static void main(String[] args) {
        LL list =  new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertLast(34);
        list.insert(45,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88, 3);
        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(40);
//        list.insert(51);
//        list.insert(85);
//        list.insert(34);
//        list.display();
//        list.delete(51);
//        list.display();
    }
}