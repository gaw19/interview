package recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BFS {
	public static void main(String[] args) {
	
		
		
		
		
		
		
		
	}
	
	static boolean search(Graph g, Node start, Node end){
		LinkedList<Node> queue = new LinkedList<BFS.Node>();
		for(Node node: g.allNodes()){
			node.state = State.UNVISITED;
		}
		
		start.state = State.VISISTING;
		queue.add(start);
		
		while(!queue.isEmpty()){
			Node u = queue.removeFirst();
			if (u != null) {
				for(Node v: u.getAdjacents()){
					if ( v.state == State.UNVISITED){
						if (v == end){
							return true;
						} else {
							v.state = State.VISISTING;
							queue.add(v);
						}
					}
				}	
				u.state = State.VISISTED;
			}
		}
		return false;
	}
	
	static class Graph{
		private List<Node> nodes = new ArrayList<Node>();
		public List<Node> allNodes(){
			return nodes;
		}
		
	}
	
	
	static class Node{
		private List<Node> adjacents = new ArrayList<Node>();
		private State state;
		public List<Node> getAdjacents(){
			return this.adjacents;
		}
		
		public State getState(){
			return this.state;
		}
	}
	
	static enum State {
		UNVISITED,
		VISISTING, 
		VISISTED
	}
}
