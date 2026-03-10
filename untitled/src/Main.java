import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8};
        int sun = 0;
        for(int num = 0;num < numbers.length;num++){
            sun += numbers[num];
        }
        System.out.println(sun);
    }
}
