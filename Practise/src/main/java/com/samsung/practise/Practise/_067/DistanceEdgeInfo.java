package com.samsung.practise.Practise._067;

public class DistanceEdgeInfo {

	private Integer distance, numEdges, lastvertex;

	public DistanceEdgeInfo() {
		this.distance = Integer.MAX_VALUE;
		this.lastvertex = -1;
		this.numEdges = Integer.MAX_VALUE;
	}

	public Integer getDistance() {
		return distance;
	}

	public Integer getNumEdges() {
		return numEdges;
	}

	public Integer getLastvertex() {
		return lastvertex;
	}

	public void setInfo(int lastVertex, int distance, int numEdges) {
		this.distance = distance;
		this.lastvertex = lastvertex;
		this.numEdges = numEdges;
	}

}
