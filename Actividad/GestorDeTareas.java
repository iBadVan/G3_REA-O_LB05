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

            //Idea de recorrido (aplicar mas adelante fija)
            Nodo <T> nodoFinal=cabeza;
            while (nodoFinal.getSiguienteNodo()!=null) {
                nodoFinal=nodoFinal.getSiguienteNodo();                
            }
            nodoFinal.setSiguienteNodo(nodoAAgregar);
        }
    }

    public boolean eliminarTarea(T tarea){
        if (cabeza==null){
            return false;
        }

        if(cabeza.getContenido().equals(tarea)){
            cabeza=cabeza.getSiguienteNodo();
            return true;
        }

        Nodo <T> nodoRecorriendo=cabeza;
        while (nodoRecorriendo.getSiguienteNodo()!=null) {
            if (nodoRecorriendo.getSiguienteNodo().getContenido().equals(tarea)){
                //peunteamos el nodo al siguiente del siguiente xd
                nodoRecorriendo.setSiguienteNodo(nodoRecorriendo.getSiguienteNodo().getSiguienteNodo());
                return true;
            }
            nodoRecorriendo=nodoRecorriendo.getSiguienteNodo();
        }
        return false;       
    }

    public boolean contieneTarea(T tarea){
        Nodo <T> nodoRecorriendo=cabeza;
        while (nodoRecorriendo !=null) {
            if (nodoRecorriendo.getContenido().equals(tarea)){
                return true;
            }
            nodoRecorriendo=nodoRecorriendo.getSiguienteNodo();
        }
        return false;
    }

    public void imprimirTareas() {
        Nodo<T> nodoRecorriendo = cabeza;
        while (nodoRecorriendo != null) {
            System.out.println(nodoRecorriendo.getContenido()); 
            nodoRecorriendo = nodoRecorriendo.getSiguienteNodo();
        }
    }





}
