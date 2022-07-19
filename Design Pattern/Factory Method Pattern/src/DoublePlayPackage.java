public class DoublePlayPackage extends Package {
    @Override
    protected void preparePackage(){
        packageName="DoublePlayPackage";
        newService.add(new TelephoneService());
        newService.add(new InternetService());
    }
}
