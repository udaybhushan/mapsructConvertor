package com.example.demo;

//@SpringBootApplication
public class MapsructConvertorApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MapsructConvertorApplication.class, args);
		
		System.out.println(TransactionStatusGroup.CANCEL_GROUP.getTxStatus().contains(TransactionStatus.TRANSACTION_CANCELLED));
		
		System.out.println(TransactionStatus.REASON_GROUP.contains(TransactionStatus.TRANSACTION_TRANSMITTED));
	}

}
