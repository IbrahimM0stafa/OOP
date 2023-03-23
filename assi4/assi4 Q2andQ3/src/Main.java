import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            arr.add(input.nextInt());
        }
        System.out.println(arr);

        System.out.println(sortar(arr));

        System.out.println(maxarr(arr));
    }

    public static ArrayList<Integer> sortar(ArrayList<Integer> x){
        int a;
        for(int i = 0; i < x.size(); i++){
            for(int j = 0; j < x.size(); j++){// i = 5 / j = 4 ///3 2 1
                if(x.get(i) < x.get(j) && i!=j){
                    a=x.get(i);
                    x.set(i, x.get(j));
                    x.set(j,a);
                }
            }
        }

        return x;
    }
    public static  int maxarr(ArrayList<Integer> x){
        int max = -99999;
        for(int i = 0; i < x.size(); i++){
            if(max < x.get(i)){
                max = x.get(i);
            }
        }
        return max;
    }


}