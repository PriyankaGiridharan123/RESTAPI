import React, { useState, useEffect } from 'react';
import axios from 'axios';

const TableData = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await axios.get('http://localhost:8080/Breakfast');
      setData(response.data);
    } catch (error) {
      console.log(error);
    }
  };
 

  return (
    <div>
      <h1>Order Details from MySQL database</h1>
      <center>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Orders</th>
            <th>Quantity</th>
          </tr>
        </thead>
        <tbody>
          {data.map((row) => (
            <tr key={row.id}>
              <td>{row.id}</td>
              <td>{row.name}</td>
              <td>{row.orders}</td>
              <td>{row.quantity}</td>
            </tr>
          ))}
        </tbody>
      </table>
      </center>
    </div>
  );
};

export default TableData;
