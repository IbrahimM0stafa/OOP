import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        try
        {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            int count = 0;
            Scanner in = new Scanner(url.openStream());
            while (in.hasNext()) {
                String line = in.nextLine();
                String[] word = line.split((" "));
                count = count + word.length ;
            }
            System.out.println("Number of words : " + count);
        }
        catch (java.net.MalformedURLException e)
        {
            System.out.println(e);
        }
        catch (java.io.IOException e)
        {
            System.out.println(e);
        }
    }
}