public class Payment {
    //pay the bill
    public void payBill(Bill bill)
    {
        //do the processing
        bill.isPaid = true;
    }

    public void isDone(Bill bill)
    {
        //do the processing
        System.out.println("Bill Payment Done: " + bill.isPaid);
    }
}
