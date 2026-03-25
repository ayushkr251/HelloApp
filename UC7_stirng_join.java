public class UC7_stirng_join{

    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }

    }

}