package javaEx.IO.bank;

@FunctionalInterface
public interface BankTransactionSummarizer {
	double summarize(double accumilator, BankTransaction bankTransection);
}