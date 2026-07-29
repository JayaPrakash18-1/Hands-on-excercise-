import React from "react";
import ListOfAllPlayers from "./Components/ListOfAllPlayers.js"
import ScoreBelow70 from "./Components/ScoreBelow70.js"
import OddPlayers from "./Components/OddPlayers.js";
import EvenPlayers from "./Components/EvenPlayers.js";
import Merge from "./Components/Merge.js";

function App() {
  const flag = false;

  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 65 },
    { name: "Gill", score: 82 },
    { name: "Rahul", score: 45 },
    { name: "Pant", score: 76 },
    { name: "Hardik", score: 68 },
  ];

  return (
      <div>
        {flag ? (
            <div>
              <h1>List of Players</h1>
              <ListOfAllPlayers players={players} />

              <hr />

              <h1>List of Players having Scores Less than 70</h1>
              <ScoreBelow70 players={players} />
            </div>
        ) : (
            <div>
              <h1>Indian Team</h1>

              <h2>Odd Players</h2>
              <OddPlayers players={players} />

              <hr />

              <h2>Even Players</h2>
              <EvenPlayers players={players} />

              <hr />

              <h2>List of Indian Players Merged</h2>
              <Merge/>
            </div>
        )}
      </div>
  );
}

export default App;