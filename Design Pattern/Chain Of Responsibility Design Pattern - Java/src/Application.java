public class Application {
    public static void main(String[] args) {

        CricketGround cricket=new CricketGround();
        VolleyballCourt volleyball=new VolleyballCourt();
        FootballGround football=new FootballGround();
        Start newStart=new Start();

        newStart.setNextPlace(cricket);
        cricket.setNextPlace(volleyball);
        volleyball.setNextPlace(football);

        Player newPlayer=new Player("Peter","Football");
        System.out.println(newStart.goToNextPlace(newPlayer));

    }
}
