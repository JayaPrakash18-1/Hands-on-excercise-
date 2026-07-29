import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! "+count);
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
      <div>
        <h1>React Event Examples</h1>

        <h2>Counter: {count}</h2>

        <button onClick={handleIncrement}>Increment</button>

        <button onClick={decrement}>
          Decrement
        </button>

        <br />
        <br />

        <button onClick={() => sayWelcome("Welcome Bhai")}>
          Say Welcome
        </button>

        <br />
        <br />

        <button onClick={handleClick}>OnClick</button>

        <hr />

        <CurrencyConvertor />
      </div>
  );
}

export default App;