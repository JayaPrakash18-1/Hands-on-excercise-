function ListOfAllPlayers({players}){
    return(
        players.map((player)=>{
            return(
                <div>
                    <li>Mr. {player.name} <span>{player.score}</span></li>
                </div>);
        })
    );
}
export default ListOfAllPlayers;