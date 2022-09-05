import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import logo from './logo.svg';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <>
   <header className="App-header">
      <div className="logo">
          <img src={logo} className="App-logo" alt="logo" />
      </div>
        <div className="menu">
        <div className="menu-item"> Search Cases </div>
        <div className="menu-item"> Explore Options </div>
        <div className="menu-item"> assign Cases </div>
        
           </div>
               
      
      </header>
      
       <App />
       
       </>
  </React.StrictMode>
);

