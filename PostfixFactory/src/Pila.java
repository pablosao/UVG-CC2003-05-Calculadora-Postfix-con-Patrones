//package Main;
//  Stack

import java.util.Vector;

public class Pila <E>
implements iPila<E> {

    protected Vector<E> vec;
    
    Pila() {
    	vec = new Vector<E>();
    }
    //  implementacion de generics aunque solo existe un ADT.

    @Override
    public void push(E obj){
    	/*post: el objeto se agrega al final del Vector*/
    	
        this.vec.add(obj);
    }

    @Override
    public E pop(){
    	/*pre: el Vector no est� vac�o
    	 post: el �ltimo elemento "pusheado" es eliminado y mostrado.
    	 */
        
        return vec.remove(vec.size() - 1);
    	
    }

	@Override
    public E peek(){
        /*
         pre: el vector no est� vac�o
    	 post: devuelve el valor de hasta arriba ( el siguiente a ser eliminado por "pop()" )
    	 */
        return this.vec.get(this.vec.size() - 1);
    }

	@Override
    public boolean empty(){
		/*post: Retorna si True si el vector est� vac�o*/

        if (this.vec.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public int size(){
    	/* post: retorna el numero de elementos que hay en el vector*/
        return this.vec.size();
    }

    public String toString(){
        System.out.println(this.vec);
        return "";
    }

}
