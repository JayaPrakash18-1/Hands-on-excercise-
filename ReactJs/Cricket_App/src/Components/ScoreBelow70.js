import ListOfAllPlayers from "./ListOfAllPlayers";
function ScoreBelow70({players}){
    let player70=players.filter((player)=>player.score<70);
    return(
        <ListOfAllPlayers players={player70}/>
    );
}
export default ScoreBelow70;