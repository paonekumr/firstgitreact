import Article from './Article';
import logo from './logo.svg';
import './index.css';



function App() {
  return (
   
  <>
    
      <header className="App-header">
      <div class="logo">
          <img src={logo} className="App-logo" alt="logo" />
          My First Application
      </div>
        <div class="menu">
        <div class="box"> Menu Item 1 </div>
        <div class="box"> Menu Item 1 </div>
        <div class="box"> Menu Item 1 </div>
        
           </div>
               
      
      </header>
      <body>
        <Article />
      </body>
    </>
  );
}

export default App;
