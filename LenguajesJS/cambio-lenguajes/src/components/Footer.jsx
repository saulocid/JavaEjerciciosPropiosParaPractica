import { useEffect, useState } from "react";


function Header({enlaces}) {
    const [anio, setAnio] = useState(0);

    useEffect(() => {
        setAnio(new Date().getFullYear())
    },[])

    return (
        <>
            <footer>
                <h2>{enlaces}</h2>
                <nav>
                    <ul>
                        <li>
                            <button>
                                <a target="blank" href="https://github.com/saulocid">Github</a>
                            </button>
                        </li>
                        <li>
                            <button>
                                <a target="blank" href="https://www.linkedin.com/in/saulociddev/">Linkedin</a>
                            </button>
                        </li>
                        <li>
                            <button>
                                <a target="blank" href="https://tusueldoendolareshoy.github.io/">Salario en dólares</a>
                            </button>
                        </li>
                        <li>
                            <button>
                                <a target="blank" href="http://paypal.me/saulocid">Donar</a>
                            </button>
                        </li>
                    </ul>
                </nav>
                <h2>Saulo Cid Dev &copy; {anio == 2024 ? anio : "2024 - " + anio}</h2>
            </footer>
        </>
    )
}

export default Header;