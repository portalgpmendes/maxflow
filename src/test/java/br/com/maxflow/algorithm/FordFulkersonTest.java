package br.com.maxflow.algorithm;

import org.junit.Assert;
import org.junit.Test;

import br.com.maxflow.algorithm.FordFulkerson;

public class FordFulkersonTest {

	@Test
	public void test() {
		int m = 10;
		FordFulkerson fordFulkerson = new FordFulkerson(m - 1);

		int s = 0;
		int t = 5;

		fordFulkerson.addEdge(s, 1, 16);
		fordFulkerson.addEdge(s, 2, 13);
		fordFulkerson.addEdge(1, 2, 10);
		fordFulkerson.addEdge(2, 1, 4);
		fordFulkerson.addEdge(1, 3, 12);
		fordFulkerson.addEdge(2, 4, 14);
		fordFulkerson.addEdge(3, 2, 9);
		fordFulkerson.addEdge(3, t, 20);
		fordFulkerson.addEdge(4, 3, 7);
		fordFulkerson.addEdge(4, t, 4);
		
		Assert.assertEquals(fordFulkerson.maxFlow(s, t), 23);
	}

}
