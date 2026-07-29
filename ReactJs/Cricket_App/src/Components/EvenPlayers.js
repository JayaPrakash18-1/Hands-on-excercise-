import ListOfAllPlayers from "./ListOfAllPlayers";
function EvenPlayers({players}){
    let playerOdd=players.filter((player,index)=>index%2==0);

    return(
        playerOdd.map((player,index)=>{
            return(
                <div><li>{index} <span>{player.name}</span></li></div>
            );
        })
    );
}
export default EvenPlayers;
