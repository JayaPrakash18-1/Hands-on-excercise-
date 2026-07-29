import React from "react";

function CourseDetails() {
    const courses = [
        {id: 1,
            name: "React JS",
            duration: "6 Weeks",
            trainer: "Mr. Kumar",
        },
        {id: 2,
            name: "Node JS",
            duration: "8 Weeks",
            trainer: "Ms. Priya",
        },
        {id: 3,
            name: "Angular",
            duration: "5 Weeks",
            trainer: "Mr. Raj",
        },
    ];

    return (
        <div>
            <h2>Course Details</h2>

            {courses.map((course) => (
                <div key={course.id}>
                    <p><b>Course:</b> {course.name}</p>
                    <p><b>Duration:</b> {course.duration}</p>
                    <p><b>Trainer:</b> {course.trainer}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default CourseDetails;