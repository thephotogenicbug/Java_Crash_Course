public class GenerateRandomNumbers {

    public static void main(String[] args) {

        while (true) {
            int num = (int) (Math.random() * 10 + 1);
            System.out.println(num + " ");
            if (num == 5) {
                break;
            }
            System.out.println(num);
        }
    }
}
