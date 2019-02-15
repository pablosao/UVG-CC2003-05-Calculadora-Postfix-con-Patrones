/**
 *
 * @author Ricardo
 */
public abstract class abstractPila<E>
implements iPila<E>{
    @Override
    public boolean empty() {
        return size()==0;
    }
}
