package com.example.demo;

import java.util.EnumSet;

public enum TransactionStatusGroup {
	CREATE_GROUP (EnumSet.of(TransactionStatus.TXN_AWAITING_CONFIRMATION,TransactionStatus.TXN_AWAITING_CONFIRMATION)), 
	
	CANCEL_GROUP(EnumSet.of(TransactionStatus.CANCELLATION_AWAITING_CONFIRMATION,TransactionStatus.TRANSACTION_CANCELLED)), 
	
	
	AML_GROUP(EnumSet.of(TransactionStatus.AML_SUSPENDED,TransactionStatus.AVAILABLE_FOR_AML_SCREENING)), 
	
	
	SWIFT_GROUP(EnumSet.of(TransactionStatus.AVAILABLE_FOR_SWIFT_MODIFICATION,TransactionStatus.AVAILABLE_FOR_SWIFT_VERIFICATION)), 
	
	
	STATUS_UPDATE_GROUP(EnumSet.of(TransactionStatus.TRANSACTION_FAILED,TransactionStatus.LOCKED_BY_AML));
	
	
	
	private EnumSet<TransactionStatus> txStatus;
	
	TransactionStatusGroup(EnumSet<TransactionStatus> txStatus) {
		this.txStatus = txStatus;
	}

	public EnumSet<TransactionStatus> getTxStatus() {
		return txStatus;
	}
	
	
}
