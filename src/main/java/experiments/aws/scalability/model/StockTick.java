package experiments.aws.scalability.model;

public class StockTick {
	float open;
	float close;
	float high;
	float low;

	public StockTick(float open2, float close2, float high2, float low2) {
		open = open2;
		close = close2;
		high = high2;
		low = low2;
		// TODO Auto-generated constructor stub
	}

	public float getOpen() {
		return open;
	}

	public void setOpen(float open) {
		this.open = open;
	}

	public float getClose() {
		return close;
	}

	public void setClose(float close) {
		this.close = close;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getLow() {
		return low;
	}

	public void setLow(float low) {
		this.low = low;
	}
}
