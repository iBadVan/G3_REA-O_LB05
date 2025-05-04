package Actividad;

public class GestorDeTareas <T> {
    private Nodo<T> cabeza;

    public GestorDeTareas(){
        cabeza=null;
    }

    public void agregarTarea(T tarea){
        Nodo <T> nodoAAgregar = new Nodo<T>(tarea,null);
        if (cabeza==null){
            cabeza=nodoAAgregar;
        } else {
            Nodo <T> nodoFinal=cabeza;
            while (nodoFinal.getSiguienteNodo()!=null) {
                nodoFinal=nodoFinal.getSiguienteNodo();                
            }
            nodoFinal.setSiguienteNodo(nodoAAgregar);
        }
    }

    

}
