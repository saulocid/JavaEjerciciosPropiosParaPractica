import { useState, useEffect } from 'react';
import reactLogo from './assets/react.svg';
import logo from '/logo.svg';
import './App.css';
import Footer from './components/Footer.jsx'

function App() {
  const [count, setCount] = useState(0);
  const [idioma, setIdioma] = useState('en');
  const [texto, setTexto] = useState(
    {
      titulo: "Cambio de lenguaje",
      informacion: "Éste es una aplicación web en la cual modificamos el lenguaje con una api de traducción. Al hacer click en el botón de las banderas de Argentina y EE.UU. se podrá ir modificando el mismo en tiempo real.",
      contador: "El contador es",
      mas: "Haz click en los logos de la aplicación y de 'React' para más información",
      enlaces: "Enlaces a mis redes sociales y proyectos"
    }
  )

  useEffect(() => {
    if (idioma === 'en') {
      setTexto({
        titulo: "Cambio de lenguaje",
        informacion: "Éste es una aplicación web en la cual modificamos el lenguaje con una api de traducción. Al hacer click en el botón de las banderas de Argentina y EE.UU. se podrá ir modificando el mismo en tiempo real.",
        contador: "El contador es",
        mas: "Haz click en los logos de la aplicación y de 'React' para más información",
        enlaces: "Enlaces a mis redes sociales y proyectos"
      })
    } else {
      setTexto({
        titulo: "Language Change",
        informacion: "This is a web application in which we modify the language with a translation API. By clicking on the button with the flags of Argentina and the USA you can modify it in real time.",
        contador: "The count is",
        mas: "Click on the app and 'React' logos for more information",
        enlaces: "Links to my social media and projects"
      })
    }
  }, [idioma]);

  return (
    <>
      <div>
        <a href="https://github.com/saulocid" target="_blank"  rel='noreferrer'>
          <img src={logo} className="logo" alt="logo" />
        </a>
        <a href="https://www.linkedin.com/in/saulociddev/" target="_blank" rel='noreferrer'>
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>

      <h1>{texto.titulo}</h1>

      <div className="card">
        <button onClick={() => setCount(count + 1)}>➕</button>
        <button onClick={() => setCount(count - 1)}>➖</button>
        <p>{texto.contador}  {count}</p>

        <button onClick={() => {
          if (idioma === 'es') {
            setIdioma('en');
          } else {
            setIdioma('es');
          }
        }} id='language'><img src={logo} alt="logo" /></button>

        <p>{texto.informacion}</p>
      </div>

      <p className="read-the-docs">{texto.mas}</p>
      <Footer enlaces={texto.enlaces} />
    </>
  );
}

export default App;
