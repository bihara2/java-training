public class Order {

    public static Package makeOrder(PackageCode packageCode){
        switch (packageCode){
            case SinglePlay :
                return new SinglePlayPackage();
            case DoublePlay:
                return new DoublePlayPackage();
            case TriplePlay:
                return new TriplePlayPackage();
            default:
                return null;
        }
    }
}
