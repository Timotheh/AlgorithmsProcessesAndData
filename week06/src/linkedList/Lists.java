package linkedList;

public class Lists<T> implements List<T>
{
	private Node<T> startNode=null;
	private int NodeNo;
	@Override
	
	public void add(int index, T value) throws ListAccessError 
	{
		Node<T> addNode = new Node<T>(value);
		if(isEmpty())
		{
			startNode = addNode;			
		}
		else
		{
			if(getNode(index-1).getNext()==null)
			{
				getNode(index-1).setNext(addNode);
			}
			else
			{
				addNode.setNext(getNode(index));
				getNode(index).setNext(addNode);
			}
			NodeNo++;
		}
		
	}
	private Node<T> getNode(int index) throws ListAccessError
	{
		Node<T> temp = startNode;
		if(index>NodeNo | index<0 | isEmpty())
		{
			throw new ListAccessError("Index out of bounds");
		}
		for(int i =0;i<index;i++)
		{
				temp = temp.getNext();
		}
		return temp;
	}

	@Override
	public T remove(int index) throws ListAccessError 
	{
		if(index==0)
		{
			T returnVal = startNode.getValue();
			startNode = startNode.getNext();
			NodeNo--;
			return returnVal;
		}
		else
		{
			Node<T> temp = getNode(index-1);
			Node<T> overwrite = getNode(index);
			T returnVal = (T) overwrite.getValue();
			if(overwrite.getNext()!=null)
			{
				temp.setNext(overwrite.getNext());
			}
			else
			{
				temp.setNext(null);
			}
			NodeNo--;
			return returnVal;
		}
	}

	@Override
	public T get(int index) throws ListAccessError 
	{
		return (T) getNode(index).getValue();
	}

	@Override
	public boolean isEmpty() {
		return startNode==null;
	}
	
}
