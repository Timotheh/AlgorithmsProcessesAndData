package graph;

import java.util.ArrayList;
import java.util.List;


public class DepthFirstTraversal<T> extends AdjacencyGraph<T> implements Traversal<T>
{

	private List<T> nodes, traversal = new ArrayList<T>();
	private int nodeSize = getNodes().size();
		
	@Override
	public List<T> traverse() throws GraphError 
	{
		for (int i=0; i<nodeSize; i++)
		{
			if(traversal.size() < nodeSize)
			{
				T startNode = (T) getNodes().toArray()[i];
				if(!traversal.contains(startNode))
				{
					Traversal(startNode);
				}
			}
		}
		return traversal;
	}
	
	private void Traversal(T node) throws GraphError
	{
		traversal.add(node);
		nodes.add(node);
		
		T[] neighbours = (T[])getNeighbours(node).toArray();
		for(int i=0;i<neighbours.length;i++)
		{
			if(neighbours[i]!=null&&!traversal.contains(neighbours[i]))
			{
				Traversal(neighbours[i]);
			}
			
		}
		
	}
	
}
