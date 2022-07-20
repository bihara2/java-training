public class CricketGround extends ProblemHandler {

    @Override
    public String goToNextPlace(Player newPlayer) {

        if(newPlayer.getSport().equals("Cricket")){
            return newPlayer.getStatus()+"\nCricketGround: Playground Founded!";
        }else {
            newPlayer.setStatus("CricketGround:You can't play "+newPlayer.getSport()+" here!");
            return nextPlace.goToNextPlace(newPlayer);
        }

    }
}
