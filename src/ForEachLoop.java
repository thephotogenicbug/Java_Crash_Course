public class ForEachLoop {

    public static void main(String[] args) {

        int[] array = {5, 3, 2, 4, 1};
        int key = 2;
        boolean found = false;
//        for (int num : array) {
//
//            System.out.println(num * num);
//        }

        // check whether the given key value is present inside my array
        for (int num : array) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
