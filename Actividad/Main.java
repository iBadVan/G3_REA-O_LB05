package Actividad;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestorDeTareas = new GestorDeTareas<>();
        
        gestorDeTareas.agregarTarea(new Tarea("Hacer la tarea del Inge Oscarin", 2));
        gestorDeTareas.agregarTarea(new Tarea("Estudiar redes", 1));
        gestorDeTareas.agregarTarea(new Tarea("Pasear a Odín por el parque", 3));
        gestorDeTareas.agregarTarea(new Tarea("Irme a dormir ", 17));

        gestorDeTareas.eliminarTarea(new Tarea("Irme a dormir ", 17));

        System.out.println("Tareas actuales:");
        gestorDeTareas.imprimirTareas();
        System.out.println(" ");

        boolean existe = gestorDeTareas.contieneTarea(new Tarea("Comprar comida", 2));
        System.out.println("¿Existe la tarea 'Comprar comida'? " + existe);
        System.out.println(" ");

        gestorDeTareas.invertirTareas();
        System.out.println("Tareas invertidas:");
        gestorDeTareas.imprimirTareas();
        System.out.println(" ");

        GestorDeTareas<Tarea> tareasCompletadas = new GestorDeTareas<>();
        Tarea tareaCompletada = new Tarea("Hacer la tarea del Inge Oscarin", 2);
        tareasCompletadas.agregarTarea(tareaCompletada);  
        gestorDeTareas.eliminarTarea(tareaCompletada);
        System.out.println(" ");

        System.out.println("Tareas actuales después de transferir:");
        gestorDeTareas.imprimirTareas();
        System.out.println(" ");
        System.out.println("Tareas completadas:");
        tareasCompletadas.imprimirTareas();

    }
}
