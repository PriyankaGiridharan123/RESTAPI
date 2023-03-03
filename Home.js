import React from 'react'
import { Link } from "react-router-dom";
import './Home.css';
function Home() {
  return (
    <body>
    <div id='sub'>
    <h1>CRUD Operation</h1>          
                <Link to="/get"><button class='but1'>Get</button></Link>
            <br></br>
                <Link to="/post"><button class='but'>Post</button></Link>
    </div>
    </body>
  )
}

export default Home