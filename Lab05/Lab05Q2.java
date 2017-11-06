package Lab05;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Lab05Q2
{
    private static int a[] = {4,5,1,6,2,7,3,8};
    public static void main(String[] args)
    {
        int k = 4;
        Lab05Q2 six = new Lab05Q2();
        six.find(a, k);
    }

    private void find(int a[],int k)
    {
        MaxComparator comparator = new MaxComparator();
        PriorityQueue pQ = new PriorityQueue(k , comparator);
        for (int i = 0; i < a.length; i++)
        {
            if (pQ.size() < k)
            {
                pQ.add(a[i]);
            } else
            {
                int x = Integer.parseInt(pQ.peek().toString());
                if (x > a[i])
                {
                    pQ.remove();
                    pQ.add(a[i]);
                }
            }
        }
        System.out.print(pQ);
    }

    static class MaxComparator implements Comparator<Integer>
    {
        @Override
        public int compare(Integer x, Integer y)
        {
            if (x < y)
                return 1;
            if (x > y)
                return -1;
            return 0;
        }
    }
}