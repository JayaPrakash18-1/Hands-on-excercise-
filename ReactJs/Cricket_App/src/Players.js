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
function ScoreBelow70({players}){
    let player70=players.filter((player)=>player.score<70);
    return(
        <ListOfAllPlayers players={player70}/>
    );
}

function OddPlayers({players}){
    let playerOdd=players.filter((player,index)=>index%2!=0);

    return(
        playerOdd.map((player,index)=>{
            return(
            <div><li>{index} <span>{player.name}</span></li></div>
            );
        })
    );
}

function Merge(){
    const T20Players=['First Player','Second Player','Third Player'];
    const RanjiTrophyPlayers=['Fourth Player','Fifth Player','Sixth Player'];
    const IndianPlayers=[ ... T20Players, ... RanjiTrophyPlayers]
    return (
        <ul>
            {IndianPlayers.map((player, index) => (
                <li key={index}>{player}</li>
            ))}
        </ul>
    );
}
