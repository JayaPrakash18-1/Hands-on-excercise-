import React from "react";
import react from "./assets/react.svg";

function App() {
  const office = {
    Name: "Sky Tower",
    Rent: 55000,
    Address: "Anna Nagar, Chennai",
    Image: react,
  };

  const offices = [
    {
      Name: "Sky Tower",
      Rent: 55000,
      Address: "Anna Nagar, Chennai",
      Image: react,
    },
    {
      Name: "Tech Park",
      Rent: 75000,
      Address: "T Nagar, Chennai",
      Image: react,
    },
    {
      Name: "Business Hub",
      Rent: 45000,
      Address: "Velachery, Chennai",
      Image: react,
    },
  ];

  return (
      <div style={{ margin: "20px" }}>
        <h1>Office Space Rental App</h1>
        <img
            src={office.Image}
            alt="Office Space"
            width="25%"
            height="25%"
        />

        <h2>Featured Office</h2>
        <p><strong>Name:</strong> {office.Name}</p>
        <p
            style={{
              color: office.Rent < 60000 ? "green" : "red",
              fontWeight: "bold",
            }}
        >
          Rent: {office.Rent}rs
        </p>
        <p><strong>Address:</strong> {office.Address}</p>

        <hr />

        <h2>Available Office Spaces</h2>

        {offices.map((item, index) => (
            <div
                key={index}
                style={{
                  border: "1px solid black",
                  padding: "10px",
                  marginBottom: "15px",
                  width: "320px",
                }}
            >
              <img
                  src={item.Image}
                  alt={item.Name}
                  width="100"
                  height="200"
              />

              <h3>{item.Name}</h3>

              <p
                  style={{
                    color: item.Rent < 60000 ? "red" : "green",
                    fontWeight: "bold",
                  }}
              >
                Rent: ₹{item.Rent}
              </p>

              <p>Address: {item.Address}</p>
            </div>
        ))}
      </div>
  );
}

export default App;