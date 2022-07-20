public class VolleyballCourt extends ProblemHandler{
    @Override
    public String goToNextPlace(Player newPlayer) {

        if(newPlayer.getSport().equals("Volleyball")){
            return newPlayer.getStatus()+"\nVolleyballCourt: Playground Founded!";
        }else {
            newPlayer.setStatus(newPlayer.getStatus()+"\nVolleyballCourt:You can't play "+newPlayer.getSport()+" here!");
            return nextPlace.goToNextPlace(newPlayer);
        }

    }
}
