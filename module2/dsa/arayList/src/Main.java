public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("hello");
        list.add("world");
        list.add("bay");
        list.add("hello");
        System.out.println("Giá trị index cần tìm:"+list.find(0));
        list.remove(1);
        System.out.println("Giá trị index cần tìm:"+list.find(1));
        System.out.println(list.getSize());
        list.update(2,"nguyen");
        list.read();

    }
}
