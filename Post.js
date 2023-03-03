import React, { useState } from 'react';
import axios from 'axios';
import './Post.css';

function Post() {



  const [formData, setFormData] = useState({
    id: '',
    name: '',
    orders: '',
    quantity: ''
  });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

      const response = await axios.post('http://localhost:8080/breakfastpost', formData);
      console.log(response.data); 
      setFormData({
        id: '',
        name: '',
        orders: '',
        quantity: ''
      });
    
  };

  const [showMessage, setShowMessage] = useState(false);

  const handleClick = () => {
    setShowMessage(true);
  };

  return (
    <body>
    <h1>ORDER DETAILS</h1>
    <form onSubmit={handleSubmit}>
    
    <div id='id'>
      <input name="id" placeholder="id" value={formData.id} onChange={handleChange} />
      </div><br></br>
      <div id='name'>
      <input name="name" placeholder="name" value={formData.name} onChange={handleChange} />
      </div><br></br>
      <div id='orders'>
      <input name="orders" placeholder="orders" value={formData.orders} onChange={handleChange} />
      </div><br></br>
      <div id='quantity'>
      <input name="quantity" placeholder="quantity" value={formData.quantity} onChange={handleChange} />
      </div><br></br>
      <div id='submit'>
      <button type="submit" class='but' onClick={handleClick}>Submit</button>
      </div><br></br><br></br><br></br><br></br><br></br>
      {showMessage && <p>Details saved!</p>}

    </form>
    </body>
  );
}

export default Post;
