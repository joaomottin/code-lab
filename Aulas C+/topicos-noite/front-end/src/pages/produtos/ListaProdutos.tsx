import { useEffect, useState } from 'react';

import axios from "axios";

import './style.css';
import { Produto } from '../../models/Produto';


function ListaProdutos() {

    const [produtos, setProdutos] = useState<Produto[]>([]);

    useEffect(() => {
        carregarDados();
    }, []);

    function carregarDados() {
        axios.get("http://localhost:5291/api/produtos")
        .then( response => {
            console.log("Resultado da requisição")
            console.log(response.data);
            setProdutos(response.data);
            
        });
    }

    function remover(id: string) {
        axios.delete(`http://localhost:5291/api/produtos/${id}`)
            .then( () => {
                carregarDados();
                alert("Produto removido com sucesso");
            })
            .catch ( err => {
                console.error(err);
                alert(err);
            });
    }

    return (
        <div className="teste">
            <h1>Lista de Produtos</h1>

            <table>
                <thead>
                    <tr>
                        <td>#</td>
                        <td>Nome</td>
                        <td>Categoria</td>
                        <td>Criado Em</td>
                        <td></td>
                        <td></td>
                    </tr>
                </thead>
                <tbody>
                    {produtos.map((produto) => (
                        <tr key={produto.id}>
                            <td>{produto.id}</td>
                            <td>{produto.nome}</td>
                            <td>{produto.categoria.nome}</td>
                            <td>{new Date(produto.criadoEm).toLocaleDateString('pt-BR')}</td>
                            <td>
                                <button onClick={ ()=> remover(produto.id)}>
                                    Deletar
                                </button>
                            </td>
                            <td>
                                <button>Alterar</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default ListaProdutos;