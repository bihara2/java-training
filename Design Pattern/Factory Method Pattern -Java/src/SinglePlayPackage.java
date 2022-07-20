public class SinglePlayPackage extends Package {

    @Override
    protected void preparePackage(){
        packageName="SinglePlayPackage";
        newService.add(new TelephoneService());

    }

}
