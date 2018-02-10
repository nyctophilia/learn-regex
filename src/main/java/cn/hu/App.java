package cn.hu;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Jregex r = new Jregex("/a{1,2}/");
        System.out.println(r.getTokens());
        Utils.show(r.getNFA());
        Utils.show(r.getDFA());
        System.out.println(r.matches("a"));
    }
}
