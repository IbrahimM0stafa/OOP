
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("Heba.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (PrintWriter out = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                out.print(((int) (Math.random() * 500) + 1));
                out.print(" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner in = new Scanner(file)) {
            while (in.hasNext()) {
                list.add(in.nextInt());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sort(list);
        System.out.print(list);
        System.out.println();
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