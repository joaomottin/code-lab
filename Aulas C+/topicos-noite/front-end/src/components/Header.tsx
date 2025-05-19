import {Link} from 'react-router-dom';

export default function Header() {
    return (
        <header>
            <nav className="navbar">
                <div className="logo">Carros</div>
                    <ul className="nav-links">
                        <li><Link to="/pages/produtos/listar">Listar Produtos </Link>       </li>
                        <li><Link to="/pages/cadastrar/listar">Cadastrar Produtos </Link>       </li>
                    </ul>
                </nav>
        </header>
    );
}