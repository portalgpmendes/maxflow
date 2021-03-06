package br.com.maxflow.algorithm.ema;

import org.junit.Assert;
import org.junit.Test;

public class FordFulkersonEmaTest {
	
	@Test
	public void test() {
		int m = 1001;
		int flow = 1000;
		FordFulkersonEma fordFulkersonEma = new FordFulkersonEma(m-1);

		int s = 0;
		int t = 3;

		fordFulkersonEma.createEdges(flow, m, s, t);

		Assert.assertEquals(fordFulkersonEma.maxFlow(s, t), 2000);
	}


}
