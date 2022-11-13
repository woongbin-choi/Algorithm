package Array;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"id1", "id2"};
        loginDemo(arr);
    }
    static void loginDemo(String[] args) {
        if(args[0].equals("id1")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}



