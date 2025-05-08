export default function Header() {
    return (
        <header>
            <nav className="navbar">
                <div className="logo">Carros</div>
                    <ul className="nav-links">
                        <li><a href="#">Cadastrar</a></li>
                        <li><a href="#">Listar</a></li>
                        <li><a href="#">Modelos </a></li>
                    </ul>
                </nav>
        </header>
    );
}