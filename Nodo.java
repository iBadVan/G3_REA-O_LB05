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


    



}