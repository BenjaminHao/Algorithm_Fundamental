package Lab03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class SpellChecker
{
    @SuppressWarnings("finally")
    private static ArrayList<String> readDataFromFile(String fileName) {

        String text = "";
        try
        {
            text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            System.out.println("File not found ");
            e.printStackTrace();
        }
        finally {
            String[] words = text.toLowerCase().split(" |\n");
            return new ArrayList<String>(Arrays.asList(words));
        }

    }

    private static int seqSearch(ArrayList<String> wordlist, ArrayList<String> testlist) {

        int i, cnt = 0;
        int length = wordlist.size();
        //String key = testlist.toCharArray();
        // for ( key = 0; key < length ; key++){
        for (String key : testlist) {
            for (i = 0; i < length; ++i){
                if (wordlist.get(i).compareTo(key) == 0)
                    break;
            }
            if (i >= length)
                cnt++;
        }
        return cnt;
    }

    private static int binSearch(ArrayList<String> wordList, ArrayList<String> testList) {

        int cnt = 0;

        for (String key : testList) {
            boolean found = false;
            int low = 0;
            int high = wordList.size() - 1;

            while (high >= low) {
                int middle = (low + high) / 2;
                int n = key.compareTo(wordList.get(middle));
                if (n == 0) {
                    found = true;
                    break;
                } else if (n < 0) {
                    high = middle - 1;
                } else
                    low = middle + 1;
            }
            if (!found)
                ++cnt;
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        ArrayList<String> wordList = readDataFromFile(
                "/Users/benjamin/IdeaProjects/COMP3761/src/Lab03/lab3_wordlist.txt");
        ArrayList<String> dataList = readDataFromFile(
                "/Users/benjamin/IdeaProjects/COMP3761/src/lab03/lab3_testdata.txt");

        long startTime = System.nanoTime();
        int cnt = seqSearch(wordList, dataList);
        long estimatedTime = System.nanoTime() - startTime;

        System.out.println("Sequential search: " + cnt + " words    " + estimatedTime / 1000.0 + " Microsecond");

        startTime = System.nanoTime();
        cnt = binSearch(wordList, dataList);
        estimatedTime = System.nanoTime() - startTime;

        System.out.println("Binary search    : " + cnt + " words    " + estimatedTime / 1000.0 + " Microsecond");
    }

}