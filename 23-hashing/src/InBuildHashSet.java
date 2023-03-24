import java.util.HashSet;
import java.util.Iterator;

public class InBuildHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        // adds only unique elements
        set.add(1);
        System.out.println(set);

        // checks
        if (set.contains(1)) {
            System.out.println("1: Present Sir ! ");
        }

        if (!set.contains(4)) {
            System.out.println("4: Absent !");
        }

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("1: Absent Sir ! ");
        }

        // size of set
        System.out.println("Size of set: " + set.size());

        System.out.println(set);


        // iterator: randomly return element present in the set
        Iterator<Integer> it = set.iterator();
        // next(): prints the current element, points to the next element
        // hasNext(): returns boolean if next element is present

        System.out.println();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
