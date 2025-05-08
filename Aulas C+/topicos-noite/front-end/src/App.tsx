import React, { useState } from 'react';
import Footer from './components/footer';
import Header from './components/Header';

function App() {

  const [count, setCount] = useState(0);
  const [count1, setCount1] = useState(0);

  return (
    <div>
      <Header />
      <br />
      <br />

      <ListaProdutos />
      
      <Footer />
    </div>
  );
}

export default App;
