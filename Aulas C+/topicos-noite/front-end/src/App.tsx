import React, { useState } from 'react';
import Footer from './components/footer';
import Header from './components/Header';
import ListaProdutos from './pages/produtos/ListaProdutos';
import CadastrarProdutos from './pages/produtos/CadastrarProdutos';
import {BrowserRouter, Routes, Route } from 'react-router-dom';

function App() {

  return (
    <div>
      <BrowserRouter>
      <Header />
        <Routes>
          <Route path='/' element={<ListaProdutos />} />  
          <Route path='/pages/produtos/listar' element={<ListaProdutos />} />  
          <Route path='/pages/produtos/cadastrar' element={<ListaProdutos />} />          
        </Routes>
      <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;
