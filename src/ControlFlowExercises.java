/**
 * Created by renecortez on 5/9/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
        int count =100;

//        while (i <=15){
//            System.out.println(i);
//            i++;
//        }
        do{
            System.out.println("count is:" + count);
            count = count - 5;
        } while (count >= -10);
    }
}