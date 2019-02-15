/**
 *
 * @author Ricardo
 */
import java.util.ArrayList;
public class arrayStack<E> extends abstractPila<E> {

    protected ArrayList<E> arr;
    
    arrayStack() {
    	arr = new ArrayList<E>();
    }
    //  implementacion de generics aunque solo existe un ADT.

    @Override
    public void push(E obj){
    	/*post: el objeto se agrega al final del Vector*/
    	
        this.arr.add(obj);
    }

    @Override
    public E pop(){
    	/*pre: el Vector no est� vac�o
    	 post: el �ltimo elemento "pusheado" es eliminado y mostrado.
    	 */
        
        return arr.remove(arr.size() - 1);
    	
    }

	@Override
    public E peek(){
        /*
         pre: el vector no est� vac�o
    	 post: devuelve el valor de hasta arriba ( el siguiente a ser eliminado por "pop()" )
    	 */
        return this.arr.get(this.arr.size() - 1);
    }

	@Override
    public boolean empty(){
		/*post: Retorna si True si el vector est� vac�o*/

        if (this.arr.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public int size(){
    	/* post: retorna el numero de elementos que hay en el vector*/
        return this.arr.size();
    }

    public String toString(){
        System.out.println(this.arr);
        return "";
    }
}
