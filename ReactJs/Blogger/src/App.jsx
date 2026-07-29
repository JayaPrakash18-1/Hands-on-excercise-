import React from "react";
import BookDetails from "./BookDetails.jsx";
import BlogDetails from "./BlogDetails.jsx";
import CourseDetails from "./CourseDetails.jsx";

function App() {
  const showBook = true;
  const showBlog = true;
  const showCourse = true;

  // Element Variable
  let courseComponent;
  if (showCourse) {
    courseComponent = <CourseDetails />;
  }

  return (
      <div>
        <h1>Blogger App</h1>
        <div  style={{
          display: "flex",
          justifyContent: "space-around",
          alignItems: "flex-start",
        }}>


          {showBook ? <BookDetails /> : <h3>No Book Details</h3>}

          <hr />

          {showBlog ? <BlogDetails /> : <h3>No Blog Details</h3>}

          <hr />

          {courseComponent}

          <hr />
        </div>
        {showBook && (
            <div>
              <h2>Special Offer</h2>
              <p>Buy any Programming Book and get 20% Discount!</p>
            </div>
        )}
      </div>
  );
}

export default App;