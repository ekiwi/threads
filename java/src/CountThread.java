
public class CountThread implements Runnable {
	public enum	Color
	{
		Black(0),
		Red(1),
		Green(2),
		Yellow(3),
		Blue(4),
		Magenta(5),
		Cyan(6),
		White(7);
		
		// https://stackoverflow.com/questions/8157755/how-to-convert-enum-value-to-int
	    private final int value;
	    private Color(int value) {
	        this.value = value;
	    }
	    public int getValue() {
	        return value;
	    }	
	}
	
	public CountThread(String name, Color color)
	{
		this.name = name;
		this.color = color;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep((int)(Math.random()*500)+250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.print("\033[3");
				System.out.print(color.getValue());
				System.out.print('m');
				System.out.print(name);
				System.out.print(": ");
				System.out.print(number);
				System.out.println("\033[0m");		
				number++;
			}
		}
	}
	
	private Color color;
	private String name;
	private int number;
	
}