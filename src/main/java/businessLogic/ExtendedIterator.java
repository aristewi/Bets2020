package businessLogic;

import java.util.Iterator;

public interface ExtendedIterator<Object> extends Iterator<Object>{
	//return the actual element and to go the next
	public Object previous();
	
	//true if ther is a previous element
	public boolean hasprevious();
	
	//it is places in the first element
	public void goFirst();
	
	//it is places in the las element
	public void goLast();

}
