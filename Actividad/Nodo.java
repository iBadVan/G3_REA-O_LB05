package Actividad;

public class Nodo<T>{
    public T contenido;
    public Nodo<T> siguienteNodo;  

    public Nodo( T cont, Nodo<T> siguienteNodo){
        this.contenido=cont;
        this.siguienteNodo=siguienteNodo;
    }

    public void setcontenido(T nuevoContenido){
        this.contenido=nuevoContenido;
    }

    public T getContenido(){
        return this.contenido;
    }

    public void setSiguienteNodo(Nodo<T> nuevoSiguienteNodo){
        this.siguienteNodo=nuevoSiguienteNodo;
    }

    public Nodo<T> getSiguienteNodo(){
        return this.siguienteNodo;
    }

}