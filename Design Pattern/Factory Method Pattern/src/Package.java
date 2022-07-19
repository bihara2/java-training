import java.util.ArrayList;
import java.util.List;

public abstract class Package {
    protected List<Services> newService=new ArrayList<>();
    protected String packageName;

    public Package(){
        preparePackage();
    }

    protected abstract void preparePackage();

    @Override
    public String toString(){
        return "Selected Package Name -"+packageName+"\n  Services -"+newService+"";
    }

}

