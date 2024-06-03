import java.util.ArrayList;
public class Solution3 {

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add element
        list.add(1);
        list.add(2);
        System.out.println(list);
        int element = list.get(0);
        System.out.println(element);
        list.set(1, 5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.size();
        System.out.println(list);

    }
}