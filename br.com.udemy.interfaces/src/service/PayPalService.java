package service;

public class PayPalService implements OnlinePaymentService
{
    
    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public double interest(double amount, int months)
    {   
        return amount * MONTHLY_INTEREST * months;
    }
    
    @Override
    public double paymentFee(double amount)
    {
        return amount * FEE_PERCENTAGE ;
    }
}
