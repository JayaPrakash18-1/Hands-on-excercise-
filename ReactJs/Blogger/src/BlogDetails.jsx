import React from "react";

function BlogDetails() {
    const blogs = [
        {
            id: 1,
            title: "Getting Started with React",
            author: "John",
            date: "29 July 2026",
        },
        {
            id: 2,
            title: "Understanding JSX",
            author: "David",
            date: "30 July 2026",
        },
    ];

    return (
        <div>
            <h2>Blog Details</h2>

            {blogs.map((blog) => (
                <div key={blog.id}>
                    <p><b>Title:</b> {blog.title}</p>
                    <p><b>Author:</b> {blog.author}</p>
                    <p><b>Date:</b> {blog.date}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default BlogDetails;