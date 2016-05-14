import java.util.*;

public class 58-Name {
    private String first, last;

    public 58-Name(String first, String last) {
        this.first = first; this.last = last;
    }

    public boolean equals(58-Name n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode(); 
    }

    public static void main(String[] args) {
        Set<58-Name> s = new HashSet<58-Name>();
        s.add(new 58-Name("Donald", "Duck"));
        System.out.println(
            s.contains(new 58-Name("Donald", "Duck")));
    }
}
