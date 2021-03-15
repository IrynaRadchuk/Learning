package questions.questions10;

import java.util.ArrayList;

public class Price {
    private ArrayList<Double> history = new ArrayList<>();
    public void priceSet(double price) {
        if (priceGet() != price) {
            history.add(price);
        }
    }
    public double priceGet() {
        if (history.isEmpty()) return 0;
        return history.get(history.size()-1);
    }

    public ArrayList<Double> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Double> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Price{" +
                "history=" + history +
                '}';
    }
}
