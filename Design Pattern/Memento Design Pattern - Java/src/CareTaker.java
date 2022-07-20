import java.util.Stack;

public class CareTaker {
    Stack<Mind.MindMemento> history=new Stack<>();

    public void saveHistory(Mind mind){
        history.push(mind.save());
    }

    public void revertHistory(Mind mind){
        if(!history.isEmpty()){
            mind.revert(history.pop());
        }else {
            System.out.println("Nothing Found in the History");
        }
    }
}
