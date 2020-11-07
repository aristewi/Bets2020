package businessLogic;

import domain.Event;

public class ExtendedIteratorEvents implements ExtendedIterator<Event>{
	Object[] list;
	private int size;
	
	@Override
	public boolean hasNext() {
		 if (size < list.length-1)
	            return true;
	        else
	            return false;
	}

	@Override
	public Event next() {
		 if (this.hasNext()) {
	        	size++;
	            return (Event) list[size];
	        }else {
	            return null;
	        }
	}

	@Override
	public Event previous() {
		 if (this.hasprevious()) {
	        	size--;
	            return (Event) list[size];
	        } else {
	            return null;
	        }
	}

	@Override
	public boolean hasprevious() {
		 if (size > 0)
	            return true;
	        else
	            return false;
		 }

	@Override
	public void goFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goLast() {
		size=list.length;
		
	}

}
