
import controladores.ListaController;
import modelos.Clientes;
import modelos.ListaModel;
import vistas.frmListas;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author diego
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //frmListas VistaLista;
        //ListaController ControladorLista;
        //ListaModel ModeloLista;
        
        
        frmListas VistaListas = new frmListas(null, true);
        ListaModel ModeloLista = new ListaModel();
        Clientes ModeloClientes = new Clientes("","");
        ListaController ControladorLista = new ListaController(VistaListas, ModeloLista, ModeloClientes);
    }
   
}
