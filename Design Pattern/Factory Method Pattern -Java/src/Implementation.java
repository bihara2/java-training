public class Implementation {
    public static void main(String[] args) {

        Package package1=Order.makeOrder(PackageCode.SinglePlay);
        System.out.println(package1);

        Package package2=Order.makeOrder(PackageCode.DoublePlay);
        System.out.println(package2);

        Package package3=Order.makeOrder(PackageCode.TriplePlay);
        System.out.println(package3);

    }
}
