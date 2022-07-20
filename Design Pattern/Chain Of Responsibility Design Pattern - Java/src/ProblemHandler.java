public abstract class ProblemHandler {
    protected ProblemHandler nextPlace;

    public void setNextPlace(ProblemHandler nextPlace){
        this.nextPlace=nextPlace;
    }

    public abstract String goToNextPlace(Player newFresher);
}
