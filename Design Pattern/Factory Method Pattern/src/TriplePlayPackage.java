public class TriplePlayPackage extends Package {
    @Override
    protected void preparePackage(){
        packageName="TriplePlayPackage";
        newService.add(new TelephoneService());
        newService.add(new InternetService());
        newService.add(new SatelliteTVService());
    }
}
