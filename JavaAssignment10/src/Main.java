public class Main {
    public static void main(String[] args) {
        SList list=new SList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.print(list);
        System.out.println();
        list.removeAtPos(list,4);
        list.print(list);
    }
}
