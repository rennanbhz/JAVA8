package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> qntVotes = new LinkedHashMap<>();

        String path = sc.nextLine();

        try (BufferedReader bfr = new BufferedReader(new FileReader(path)))
        {
            String line = bfr.readLine();

            while (line != null)
            {
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (qntVotes.containsKey(name))
                {

                    int votesSoFar = qntVotes.get(name);
                    qntVotes.put(name, votes + votesSoFar);
                }
                else
                {
                    qntVotes.put(name, votes);
                }
                line = bfr.readLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        sc.close();
    }
}
