package hackerrank;

import java.util.*;

public class Result {

    public static void main(String[] args) {
    // productName, relevance, price  -- > [items], SortParameter(0,1,2), SortOrder(0,1),itemsPerPage,pageNumber
        List<List<String>> items = new ArrayList<>();

        List<String> item1 = new ArrayList<>();
        item1.add("p1"); item1.add("1"); item1.add("2");

        List<String> item2 = new ArrayList<>();
        item2.add("p2"); item2.add("2"); item2.add("1");

        List<String> item3 = new ArrayList<>();
        item3.add("p3"); item3.add("3"); item3.add("2");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        List<String> list= fetchItemsToDisplay(items,1,1,1,4);
        for(String s:list)
            System.out.println(s);
    }

    public static List<String> fetchItemsToDisplay(List<List<String>> items,
                                                   int sortParameter, int sortOrder,
                                                   int itemsPerPage, int pageNumber) {
        // Write your code here
        List<String> result = new ArrayList<>();
        int itemsSize = items.size();
        //item1 //item --> (P1,1,2) (P2,2,1)
        Comparator<List<String>> mycompasc = (o1, o2)-> o1.get(sortParameter).compareTo(o2.get(sortParameter));
        Comparator<List<String>> mycompdesc = (o1, o2)-> o2.get(sortParameter).compareTo(o1.get(sortParameter));

        if(sortOrder == 0)
        Collections.sort(items,mycompasc);
        else if(sortOrder == 1)
            Collections.sort(items,mycompdesc);

        int NoOfPages = itemsSize/itemsPerPage;
        int deltaPages = itemsSize%itemsPerPage;

        int startIndex = pageNumber * itemsPerPage;
        if(pageNumber+1>NoOfPages) return result;          //

        for(int index = startIndex;index < (itemsPerPage*(pageNumber+1)) ;index++){
            result.add(items.get(index).get(0));
        }

        return result;

    }
}
