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
      titulo: "",
      informacion: "",
      contador: "",
      mas: "",
      enlaces: {
        cuerpo: "",
        sueldo: "",
        donar: ""
      }
    }
  )

  useEffect(() => {
    if (idioma === 'en') {
      setTexto({
        titulo: "Cambio de lenguaje",
        informacion: "Haz click en el botón anterior para modificar el idioma de la página",
        contador: "El contador es",
        mas: "Haz click en los logos de la aplicación y de 'React' para más información",
        enlaces: {
          cuerpo: "Enlaces a mis redes sociales y proyectos",
          sueldo: "Tu sueldo en dólares",
          donar: "Donar"
        }
      })
    } else {
      setTexto({
        titulo: "Language Change",
        informacion: "Click on the previous button to modify the language of the page.",
        contador: "The count is",
        mas: "Click on the app and 'React' logos for more information",
        enlaces: {
          cuerpo: "Links to my social media and projects",
          sueldo: "Salary in dolars",
          donar: "Donate"
        }
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
      <Footer cuerpo={texto.enlaces.cuerpo} sueldo={texto.enlaces.sueldo} donar={texto.enlaces.donar} />
    </>
  );
}

export default App;
