import axios from 'axios';
import { useEffect } from 'react';

function ListaProdutos (){

    useEffect(() => {
        carregarDados();
    });

    function carregarDados(){
        axios.get("http://localhost:5291/api/produtos")
        .then( response => {
            console.log("Resultado da requisição")
            console.log(response.data);
        });
    }


    return {
        <div>
            <h1> Lista de produtos</h1>
        <\div>
    }
}

export default ListaProdutos;