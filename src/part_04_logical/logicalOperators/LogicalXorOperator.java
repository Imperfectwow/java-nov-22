package part_04_logical.logicalOperators;

public class LogicalXorOperator {
    public static void main(String[] args) {

        //                  true   ^   true
        System.out.println((6 > 5) ^ (10 > 5));
        //                  true   ^   false
        System.out.println((6 > 5) ^ (10 < 5));
        //                  false   ^   false
        System.out.println((6 < 5) ^ (10 < 5));
        //                  false   ^   true
        System.out.println((6 < 5) ^ (10 > 5));

    }
}
