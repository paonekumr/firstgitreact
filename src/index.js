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
        <div className="menu-item"> Menu Item 1 </div>
        <div className="menu-item"> Menu Item 2 </div>
        <div className="menu-item"> Menu Item 3 </div>
        
           </div>
               
      
      </header>
      
       <App />
       
       </>
  </React.StrictMode>
);

