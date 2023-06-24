package batallanaval;

import Entidades.Tablero;
import Servicios.ServicioTablero;

public class BatallaNaval {

    public static void main(String[] args) {

        ServicioTablero st = new ServicioTablero();
        Tablero tab1 = st.crearTablero();
        st.juego(tab1);
        System.out.println("GRACIAS POR JUGAR!!!");
        
    }

}
