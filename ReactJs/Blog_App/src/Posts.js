import {Component} from "react";
class Post extends Component{
    constructor(props) {
        super(props);
        this.state={
            posts:[]
        };
    }
    loadposts(){
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then(res=>res.json())
            .then(data=>this.setState({posts:data}))
            .catch((err)=>console.log(err,": Error"));
    }
    componentDidMount() {
        this.loadposts();
    }
    render(){
        return(
            <div>
                <h2>Posts</h2>

                {this.state.posts.map((post) => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
    componentDidCatch(error, errorInfo) {
        console.log("Error:", error);
        console.log("Error_Info:", errorInfo);
    }
}
export default Post;