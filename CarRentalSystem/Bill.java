public class Bill {
    Reservation reservation_id;
    boolean isPaid;
    double amount;

    public Bill(Reservation reservation_id)
    {
        this.reservation_id = reservation_id;
        this.isPaid = false;
        this.amount = computeAmount();
    }

    public double computeAmount()
    {
        return 100.00;
    }

    public void getAmount()
    {
        System.out.println("Amount to Pay: " + amount);
    }
}
