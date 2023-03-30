import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Invalid arguments.");
            System.exit(1);
        }

        File file = new File(args[1]);
        if (!file.exists())
        {
            System.out.println(args[1] + " does not exist.");
            System.out.println(2);
        }

        String x = null;
        try
        {
            Scanner in = new Scanner(file);
            while (in.hasNext())
            {
                x += in.nextLine();
            }
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        x = x.replaceAll(args[0], null);
        try
        {
            PrintWriter out = new PrintWriter(file);
            out.write(x);
            out.close();
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}