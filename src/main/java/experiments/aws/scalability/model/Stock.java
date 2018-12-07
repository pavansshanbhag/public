package experiments.aws.scalability.model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	String id;
	String symbol;
	double currentPrice;
	
	List<StockTick> ticks;
	
	
	TickInterval tickInterval;
	
	public enum TickInterval {
		MINUTE_1, MINUTE_3, MINUTE_5, MINUTE_15, MINUTE_30, HOUR_1, HOUR_4, DAY, MONTH 
	}

	public Stock(String _id, String _symbol, double _currentPrice, TickInterval _interval) {
		
		id = _id;
		symbol = _symbol;
		currentPrice = _currentPrice;
		tickInterval = _interval;
	}
	
	public void addTick(float open, float close, float high, float low) {
		if(ticks == null) {
			ticks = new ArrayList<>();
		}
		ticks.add(new StockTick(open,close,high,low));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public List<StockTick> getTicks() {
		return ticks;
	}

	public void setTicks(List<StockTick> ticks) {
		this.ticks = ticks;
	}

	public TickInterval getTickInterval() {
		return tickInterval;
	}

	public void setTickInterval(TickInterval tickInterval) {
		this.tickInterval = tickInterval;
	}

	

}
