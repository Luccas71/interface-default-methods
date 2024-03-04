package service;

import java.security.InvalidParameterException;

public interface InterestService {
    
    Double getInterestRate();

    default double payment(double amount, int month) {
        if (month < 1) {
            throw new InvalidParameterException("Month must be greater than zero");
        }
        return amount * Math.pow(1 + getInterestRate()/100, month);
    }
}
