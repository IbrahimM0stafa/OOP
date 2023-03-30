import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");

        list.add(x.nextInt());
        list.add(x.nextInt());
        list.add(x.nextInt());
        list.add(x.nextInt());
        list.add(x.nextInt());

        sort(list);

        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list){
        int temp = 0;
        for(int i=0; i < list.size(); i++){
            for(int j=1; j < (list.size()-i); j++){
                if(list.get(j-1) > list.get(j)){
                    temp = list.get(j-1);
                    list.set(j-1,list.get(j));
                    list.set(j,temp);
                }

            }
        }
    }
}