package no.evote.exception;

import no.valg.eva.admin.common.UserMessage;

import java.util.ArrayList;
import java.util.List;

public class CandidateValidationException extends EvoteException {

	private List<UserMessage> validationMessages;

	public CandidateValidationException(List<UserMessage> validationMessages) {
		this.validationMessages = new ArrayList<>(validationMessages);
	}

	public List<UserMessage> getValidationMessages() {
		return validationMessages;
	}
}
