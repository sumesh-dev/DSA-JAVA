package Lec54;

import java.util.HashMap;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;
	
	public Graph(int v) {
		map = new HashMap<>();
		for(int i = 1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}
	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}
	public int noofedge() {
		int ans = 0;
		for(int key:map.keySet()) {
			ans+=map.get(key).size();
		}
		return ans/2;
	}
	
	public void removeEdge(int v1, int v2) {
		if(ContainsEdge(v1,v2)) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
		}
	}
	public void removeVertex(int v1) {
		for(int nbrs:map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	
	public void display() {
		for(int key :map.keySet()) {
			System.out.println(key + "-->" +  map.get(key));
		}
	}
}
