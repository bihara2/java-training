public class FootballGround extends ProblemHandler{

    @Override
    public String goToNextPlace(Player newPlayer) {

        if(newPlayer.getSport().equals("Football")){
            return newPlayer.getStatus()+"\nFootballGround: Playground Founded!";
        }else {
            newPlayer.setStatus(newPlayer.getStatus()+"\nFootballGround:You can't play "+newPlayer.getSport()+" here!");
            newPlayer.setStatus(newPlayer.getStatus()+"\nThere is no place to play your sport!");
            return newPlayer.getStatus();
        }

    }
}
