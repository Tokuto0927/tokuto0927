package prefecture;

public class Prefecture {
    private int num;
    private String name;
    private String capital;
    private double area;

    public Prefecture(int num,String name,String capital,double area) {
        this.num = num;
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
    
    public String getCapital() {
    	return capital;
    }
    

    public double getArea() {
        return area;
    }
}
