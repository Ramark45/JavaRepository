public class BrowserHistory {
    public static void main(String[] args) {
        BrowserHistoryFunctions bh = new BrowserHistoryFunctions("MyHome.com");
        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("twitter.com");

        String back_step = bh.back(1);
        System.out.println("Redirected to " + back_step);

        String fwd_step = bh.forward(2);
        System.out.println("Redirected to " + fwd_step);

        System.out.println("");
        bh.visit("linkedin.com");

        back_step = bh.back(6);
        System.out.println("Redirected to " + back_step);
    }
}
class Site {
    public Site previous;
    public Site next;
    public final String url;
    public Site(final String url) {
        this.url = url;
    }
}

class BrowserHistoryFunctions {

    private Site current;

    public BrowserHistoryFunctions(String homepage) {
        current = new Site(homepage);
        System.out.println("Homepage: " + homepage);
    }

    public void visit(String url) {
        current.next = new Site(url);
        current.next.previous = current;
        current = current.next;
        System.out.println("Directing to: " + url);
    }

    public String back(int steps) {
        System.out.println("\nCurrently at: " + current.url);
        System.out.println("Going Back " + steps + " step/s");
        while (current.previous != null && steps-- > 0)
            current = current.previous;
        return current.url;
    }

    public String forward(int steps) {
        System.out.println("\nCurrently at: " + current.url);
        System.out.println("Going Forward " + steps + " step/s");
        while (current.next != null && steps-- > 0)
            current = current.next;
        return current.url;
    }
}