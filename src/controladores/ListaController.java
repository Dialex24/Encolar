/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import modelos.Clientes;
import modelos.ListaModel;
import vistas.frmListas;

/**
 *
 * @author diego
 */
public class ListaController implements ActionListener {
frmListas VistaLista;
ListaModel  ModeloLista;
Clientes ModeloClientes;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista, Clientes ModeloClientes) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        this.ModeloClientes = ModeloClientes;
        
        //poner a la escucha los botones 
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        
        //levantar formularo listas
        
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }


    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==this.VistaLista.btnIngresarCliente)
    {
        this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                this.VistaLista.txtNombre.getText());
        
        //traer la lista desde modelos 
        Queue<Clientes> listaLocal = this.ModeloLista.ListarClientes();
        
        //recorrer la lista y asignar text area
        String Cadena = "";
        for(Clientes MiListaClientes: listaLocal)
        {
            Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
            this.VistaLista.txtListaClientes.setText(Cadena);
        }
      
    }
    
  }
    
}
