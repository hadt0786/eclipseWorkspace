package com.Graph.practise._8june01;

import java.util.List;
/**Graph 
 * Type - DIrected or Undirected
 * 
 * */

public interface Graph {
	
	
	
	enum GraphType {
		UNDIRECTED, DIRECTED
	}
	
	void addEdge(int v1, int v2);
	
	
	List<Integer> getAdjacentList(int v);

}
