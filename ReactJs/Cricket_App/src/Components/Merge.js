
function Merge(){
    const T20Players=['First Player','Second Player','Third Player'];
    const RanjiTrophyPlayers=['Fourth Player','Fifth Player','Sixth Player'];
    const IndianPlayers=[ ... T20Players, ... RanjiTrophyPlayers]
    return (
        <div>
            <ul>
                {IndianPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>
        </div>
    );
}

export default Merge;
