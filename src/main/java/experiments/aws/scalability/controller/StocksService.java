package experiments.aws.scalability.controller;

import java.util.Arrays;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Component;

import experiments.aws.scalability.model.Stock;
import experiments.aws.scalability.model.Stock.TickInterval;

@Component
@Path("/stocks")
public class StocksService {
	@GET
	@Produces("application/json")
	@Path("/{symbol}")
	public Stock getStock(@PathParam("symbol") String symbol, @QueryParam(value = "interval") String interval)
			throws InterruptedException {
		Random r = new Random();

		Stock s = new Stock(String.valueOf(r.nextInt()), symbol, r.nextFloat(), getInterval(interval));
		int limit = (1 + r.nextInt(3)) * 1000;
		
		someTimeTakingProcessig();


		for (int idx = 0; idx < limit; idx++) {
			s.addTick(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
		}
		return s;
	}

	private void someTimeTakingProcessig() {

		Random r = new Random();
		int limit = (1+r.nextInt(9))*10000;
		float array[] = new float[limit];
		
		for(int idx= 0; idx<limit; idx++) {
			array[idx] = r.nextFloat();
		}
		Arrays.sort(array);
	}

	private TickInterval getInterval(String interval) {
		// TODO Auto-generated method stub
		return TickInterval.valueOf(interval);

	}

}
