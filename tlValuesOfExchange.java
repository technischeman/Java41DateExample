package homework1;

public class tlValuesOfExchange {
    private double euroValueoftl;
    private double DolarValueoftl;

    public double getEuroValueoftl() {
        return euroValueoftl;
    }

    public void setEuroValueoftl(double euroValueoftl) {
        this.euroValueoftl = euroValueoftl;
    }

    public double getDolarValueoftl() {
        return DolarValueoftl;
    }

    public void setDolarValueoftl(double dolarValueoftl) {
        DolarValueoftl = dolarValueoftl;
    }

    public tlValuesOfExchange(double euroValueoftl, double dolarValueoftl) {
        this.euroValueoftl = euroValueoftl;
        DolarValueoftl = dolarValueoftl;
    }
}
