package Lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab06 {
    public static void main(String[] args) throws FileNotFoundException {

        // Question 1
        Map<String, Integer> m = new TreeMap<>();
        ArrayList<String> a = new ArrayList<>();
        Scanner scan = new Scanner(new File("src/Lab06/love.txt"));

        while (scan.hasNext())
        {
            a.add(scan.next());
        }

        String word;
        int count1;
        for (int i = 0; i < a.size(); i++)
        {
            word = a.get(i).toLowerCase();
            if (m.containsKey(word))
            {
                count1 = m.get(word);
                count1++;
                m.put(word, count1);
            } else {
                m.put(word, 1);
            }
        }

        System.out.println();
        System.out.println("Question 1");
        System.out.println("---------------");
        //print map
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        // Question 2
        System.out.println("");
        HashSet<String> hs = new HashSet<>();
        Scanner scan2 = new Scanner(new File("src/Lab06/q2input.txt"));
        boolean distinct = true;
        while (scan2.hasNext()) {
            if (hs.contains(scan2.next()))
            {
                distinct = false;
            } else {
                hs.add(scan2.next());
            }
        }
        System.out.println();
        System.out.println("Question 2");
        System.out.println("---------------");
        if (distinct)
        {
            System.out.println("DISTINCT");
        } else {
            System.out.println("NOT DISTINCT");
        }

        // Question 3
        Scanner reader = new Scanner(new File("src/Lab06/q3test.txt"));
        HashSet<String> keywords = new HashSet<>();
        TreeSet<Object> tmax = new TreeSet<>();
        int N = reader.nextInt();
        int M = reader.nextInt();
        int max = 0;
        for(int i = 0; i < N; i++)
            keywords.add(reader.nextLine());
        reader.nextLine();
        for(int i = 0; i < M; i++)
        {
            String excuse = reader.nextLine();
            String words[] = excuse.split(" ");
            int count3 = 0;
            for(int j = 0; j < words.length; j++)
            {
                if(keywords.contains(words[i]))
                    count3++;
            }
            if(count3 > max)
            {
                max = count3;
                tmax.clear();
                tmax.add(excuse);
            }
            if(max == count3)
                tmax.add(excuse);
        }
        System.out.println();
        System.out.println("Question 3");
        System.out.println("---------------");
        System.out.println(tmax.toString());
        reader.close();
        // Question 3
        /*System.out.println();
        Scanner file = new Scanner(new File("src/Lab07/q3test.txt"));
        HashSet<String> key = new HashSet<>();
        ArrayList<String> excuse = new ArrayList<>();
        Map<String, Integer> m3 = new TreeMap<>();
        String lines;
        String words[];
        int k = 0; // # of keywords
        int e = 0; // # of excuses
        int line = 1;
        int count3;

        while (file.hasNext()) {
            if (line == 1) {
                lines = file.nextLine();
                words = lines.split(" ");
                k = Integer.parseInt(words[0]);
                e = Integer.parseInt(words[1]);
            }
            if (line <= k + 1) {
                key.add(file.next());
            }
            if (line > k + 1 && line <= k + 1 + e) {
                excuse.add(file.nextLine());
            }
            line++;
        }*/
/*        System.out.println(key);
        System.out.println(excuse);
        for (int i = 0; i < excuse.size(); i++) {
            String[] excuseWords = excuse.get(i).split(" ");
            for (String s: excuseWords) {
                if (key.contains(s)) {
                    count3 = m3.get(s);
                    count3++;
                    m3.put(s, count3);
                } else {
                    m3.put(s, 1);
                }
            }
        }
        //print map
        for (Map.Entry<String, Integer> entry : m3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/
/*        static void q3(String file) throws FileNotFoundException
        {
            Scanner reader = new Scanner(new FileReader(file));
            HashSet<String> keywords = new HashSet<>();
            TreeSet<Object> tmax = new TreeSet<>();
            int N = reader.nextInt();
            int M = reader.nextInt();
            int max = 0;
            for(int i = 0; i < N; i++)
                keywords.add(reader.nextLine());
            // skip first line
            reader.nextLine();
            for(int i = 0; i < M; i++)
            {
                String excuse = reader.nextLine();
                String words[] = excuse.split(" ");
                int count = 0;
                for(int j = 0; j < words.length; j++)
                {
                    if(keywords.contains(words[i]))
                        count++;
                }
                if(count > max)
                {
                    max = count;
                    tmax.clear();
                    tmax.add(excuse);
                }
                if(max == count)
                    tmax.add(excuse);
            }
            System.out.println(tmax.toString());
            reader.close();
        }*/
    }
}