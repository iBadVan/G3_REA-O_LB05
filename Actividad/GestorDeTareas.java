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

    public int contarTareas() {
        int cont=0;
        Nodo<T> nodoRecorriendo = cabeza;
        while (nodoRecorriendo != null) {
            cont++; 
            nodoRecorriendo = nodoRecorriendo.getSiguienteNodo();
        }
        return cont;
    }

    public T obtenerTareaMasPrioritaria() {
        if (cabeza == null){
            return null; 
        } 

        Nodo<T> nodoRecorriendo = cabeza;
        T tareaPrioritaria = cabeza.getContenido();
        while (nodoRecorriendo != null) {
            T tareaActual = nodoRecorriendo.getContenido();
            if (((Tarea)tareaActual).getPrioridad() < ((Tarea)tareaPrioritaria).getPrioridad()) {
                tareaPrioritaria = tareaActual;
            }
            nodoRecorriendo = nodoRecorriendo.getSiguienteNodo();
        }
        return tareaPrioritaria;
    }
    
    public void invertirTareas() {
        Nodo<T> anterior = null;
        Nodo<T> actual = cabeza;
        Nodo<T> siguiente = null;
        while (actual != null) {
            siguiente = actual.getSiguienteNodo(); 
            actual.setSiguienteNodo(anterior); 
            anterior = actual;  
            actual = siguiente; 
        }
        cabeza = anterior;
    }

    public boolean sonIguales(GestorDeTareas<T> otraLista) {
        Nodo<T> nodoActual1 = cabeza;
        Nodo<T> nodoActual2 = otraLista.cabeza;

        while (nodoActual1 != null && nodoActual2 != null) {
            if (!nodoActual1.getContenido().equals(nodoActual2.getContenido())) {
                return false;
            }
            nodoActual1 = nodoActual1.getSiguienteNodo();
            nodoActual2 = nodoActual2.getSiguienteNodo();
        }

        return (nodoActual1 == null && nodoActual2 == null);
    }

    public GestorDeTareas<T> concatenarListas(GestorDeTareas<T> otraLista) {
        GestorDeTareas<T> listaConcatenada = new GestorDeTareas<>();

        Nodo<T> nodoActual = cabeza;
        while (nodoActual != null) {
            listaConcatenada.agregarTarea(nodoActual.getContenido());
            nodoActual = nodoActual.getSiguienteNodo();
        }

        Nodo<T> nodoActual2 = otraLista.cabeza;
        while (nodoActual2 != null) {
            listaConcatenada.agregarTarea(nodoActual2.getContenido());
            nodoActual2 = nodoActual2.getSiguienteNodo();
        }

        return listaConcatenada;
    }

}
