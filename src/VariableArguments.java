public class VariableArguments {


    static float getAvg(float ...varargs){

//        System.out.println(varargs.getClass().getSimpleName());

        float total = 0;

        for(float num : varargs){
            total += num;
        }

        return total / varargs.length;

    }

    public static void main(String[] args){

        float avg1 = getAvg(2,5,6,1,8,9);
        float avg2 = getAvg(2,8,1);
        System.out.println(avg1);
        System.out.println(avg2);

    }
}
