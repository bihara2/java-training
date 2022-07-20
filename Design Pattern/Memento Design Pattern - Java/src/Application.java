public class Application {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Mind mind=new Mind();

        mind.addItem(new Task("Wake up"));
        mind.addItem(new Task("Eat"));
        careTaker.saveHistory(mind);
        System.out.println(mind);

        mind.addItem(new Task("Code"));
        careTaker.saveHistory(mind);
        System.out.println(mind);

        mind.addItem(new Task("Sleep"));
        careTaker.saveHistory(mind);
        System.out.println(mind);

        careTaker.revertHistory(mind);
        System.out.println(mind);

        careTaker.revertHistory(mind);
        System.out.println(mind);

        careTaker.revertHistory(mind);
        System.out.println(mind);
    }
}
