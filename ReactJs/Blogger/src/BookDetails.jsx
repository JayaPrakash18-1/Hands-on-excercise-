import React from "react";

function BookDetails() {
    const books = [
        {
            id: 1,
            title: "React in Action",
            author: "Mark Tielens Thomas",
            price: 650,
        },
        {
            id: 2,
            title: "Java Programming",
            author: "Herbert Schildt",
            price: 550,
        },
        {
            id: 3,
            title: "Python Crash Course",
            author: "Eric Matthes",
            price: 700,
        },
    ];

    return (
        <div>
            <h2>Book Details</h2>

            {books.map((book) => (
                <div key={book.id}>
                    <p><b>Title:</b> {book.title}</p>
                    <p><b>Author:</b> {book.author}</p>
                    <p><b>Price:</b> ₹{book.price}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default BookDetails;