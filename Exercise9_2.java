package Exercise;

public class Exercise9_2 {

	public static void main(String[] args) {
		Stock st = new Stock("ORCL", "Oracle Corporation");
		
		System.out.print(st.getChangePercent(34.5,34.35));
	}
}

class Stock{
	String symbol;//股票代码
	String name;//股票名字
	double previousClosingPrice;//前一日的股票值
	double currentPrice;//当时的股票值
	
	Stock()
	{
		
	}
	
	Stock(String symbol,String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercent(double a,double b)
	{
		return (b / a);
	}
}