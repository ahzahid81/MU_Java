//Fig: 16.12
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


public class BinarySearchTest
{
    private static void printSearchResults(List<String> list, String key)
    {
        int result = 0;

        System.out.printf("%nSearchng for: %s%n",key);
        result = Collections.binarySearch(list, key);

        if(result>=0)
            System.out.printf("Found at index: %d%n",result);
        else   
            System.out.printf("Not Found (%d)%n",result);
    }

    public static void main(String[] args) 
    {
        String[] colors = {"red", "white", "blue", "black", "yellow", 
        "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s%n", list);

        printSearchResults(list, "black");
        printSearchResults(list, "red");
        printSearchResults(list, "pink"); 
        printSearchResults(list, "aqua");
        printSearchResults(list, "gray");
        printSearchResults(list, "teal");
    }
}