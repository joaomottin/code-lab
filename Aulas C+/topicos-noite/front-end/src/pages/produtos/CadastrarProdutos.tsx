import axios from "axios";
import { useEffect, useState } from "react";

import './cadastro-produto.css';

function CadastrarProdutos() {
    const [nome, setNome] = useState("");
    const [preco, setPreco] =  useState(0);
    const [descricao, setDescricao] = useState("");
    const [quantidade, setQuantidade] = useState<number>();
    const [categoriaId, setCategoriaId] = useState(null);
    const [categorias, setCategorias] = useState<any[]>([]);

    useEffect( () => {
        carregarCategorias();
        buscarProdutoPorId("");
    }, []);

    function carregarCategorias() {
        axios.get("http://localhost:5291/api/categorias")
        .then( response => {
            setCategorias(response.data);
        });
    }

    function buscarProdutoPorId(id: string) {
        if (id != null && id.length > 0) {
            axios.get(`http://localhost:5291/api/produtos/${id}`)
            .then( response => {
                var p = response.data;
                setNome(p.nome);
                setPreco(p.preco);
                setDescricao(p.descricao);
                setQuantidade(p.quantidade);
                setCategoriaId(p.categoriaId);
            })
            .catch(error => {
                console.error('Erro ao buscar produt:', error);
            });
        }
    }

    function salvar(evento: any) {
        evento.preventDefault();

        const produto = {
            nome: nome,
            preco: Number(preco),
            descricao: descricao,
            quantidade: Number(quantidade),
            categoriaId: Number(categoriaId)
        }

        axios.post('http://localhost:5291/api/produtos', produto)
            .then(response => {
                console.log('Produto salvo:', response.data);
            })
            .catch(error => {
                console.error('Erro ao salvar produto:', error);
            });
    }

    return (
        <div className="cadastro">
            <h1>Novo Produto</h1>

            <form onSubmit={salvar}>
                <div>
                    <label htmlFor="name">Nome</label>
                    <input
                        onChange={ (event: any) => setNome(event.target.value) }
                        type="text"
                        id="name"
                        value={nome}
                        required
                        placeholder="Digite o nome do Produto"
                     />
                </div>

                <div>
                    <label htmlFor="descricao">Descrição</label>
                    <textarea
                        onChange={ (event: any) => setDescricao(event.target.value) }
                        id="descricao"
                        value={descricao}
                        required
                        placeholder="Digite a descrição do Produto"
                     />
                </div>

                <div>
                    <label htmlFor="quantidade">Quantidade</label>
                    <input
                        onChange={ (event: any) => setQuantidade(event.target.value) }
                        type="number"
                        id="quantidade"
                        value={quantidade}
                        required
                        placeholder="Digite a quantidade de Produtos"
                     />
                </div>

                <div>
                    <label htmlFor="preco">Preço</label>
                    <input
                        onChange={ (event: any) => setPreco(event.target.value) }
                        type="number"
                        id="preco"
                        value={preco}
                        required
                        step="0.01"
                        placeholder="Digite a quantidade de Produtos"
                     />
                </div>

                <div>
                    <label htmlFor="categoria">Categorias</label>
                    <select
                        id="categoria"
                        onChange={ (event: any) => setCategoriaId(event.target.value) }>
                        {categorias.map( (categoria) => (
                            <option key={categoria.id} value={categoria.id}>
                                {categoria.nome}
                            </option>
                        ))}
                   </select>
                </div>

                <button type="submit">
                    Salvar
                </button>
            </form>
        </div>
    );
}

export default CadastrarProdutos;