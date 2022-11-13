package otus;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;



public class App
{
    public static void main (String... args)
    {
        List<Integer> exList = new ArrayList<>();
        for (int i = 0; i < 50; i++)
        {
            exList.add(100-i);
        }
        System.out.println(Lists.reverse(exList));
    }
}