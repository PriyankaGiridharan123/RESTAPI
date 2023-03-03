import React from 'react';
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import './App.css';
import Loginn from './Loginn';
import Signup from './Signup';
import Post from './Post';
import TableData from './Get';
import Home from './Home';
function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
      <Route path='/' element={<Loginn/>}></Route>
      <Route path='Signup' element={<Signup/>}></Route>
      <Route path="/Home" element={<Home />} />
        <Route path="/Get" element={<TableData />} />
        <Route path="/Post" element={<Post />} />
      </Routes>
      </BrowserRouter>      
    </div>
  );
}

export default App;