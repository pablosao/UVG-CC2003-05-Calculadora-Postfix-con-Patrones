
/**
 *
 * @author Satellite
 */
public class FactoryStack<E> {
    public abstractPila factoryPila(String tipo){
        if (tipo.equals("1")) {
            return new Pila<String>();
        }
        else if(tipo.equals("2")){
            return new arrayStack();
        }
            return null;
        }    
    public AbstractList<E> factoryList(String tipo){
        if (tipo.equals("SL")) {
            return new SinglyLinkedList<>();
        }
        else if(tipo.equals("DL")){
            return new DoublyLinkedList<>();
        }
        else if(tipo.equals("CL")){
            return new CircularList<>();
        }
            return null;
    }
}