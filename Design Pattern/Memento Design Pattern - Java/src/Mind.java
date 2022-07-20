import java.util.ArrayList;

public class Mind {
    ArrayList<Task> taskList=new ArrayList<>();
    public void addItem(Task task){
        taskList.add(task);
    }
    public ArrayList<Task> getTaskList() {
        return (ArrayList)taskList.clone();
    }
    public MindMemento save(){
        return new MindMemento(getTaskList());
    }
    public void revert(MindMemento mindMemento){
        taskList=mindMemento.getTaskList();
    }
    static class MindMemento{
        ArrayList<Task> taskList;

        public MindMemento(ArrayList<Task> task){
            this.taskList=task;
        }
        private ArrayList<Task> getTaskList(){
            return taskList;
        }
    }
    @Override
    public String toString() {
        return "Mind{" +
                " Todo = " + taskList +
                '}';
    }
}
