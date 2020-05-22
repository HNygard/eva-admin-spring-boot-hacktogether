package no.valg.eva.admin.common.counting.service;

import no.evote.security.UserData;
import no.valg.eva.admin.common.counting.model.ApprovedCastBallotRefForApprovedFinalCount;
import no.valg.eva.admin.common.counting.model.CastBallotBinaryData;
import no.valg.eva.admin.common.counting.model.RejectedCastBallotRefForApprovedFinalCount;

import java.io.Serializable;

public interface CastBallotBinaryDataService extends Serializable {
	CastBallotBinaryData rejectedCastBallotBinaryData(UserData userData, RejectedCastBallotRefForApprovedFinalCount ref);

	CastBallotBinaryData approvedCastBallotBinaryData(UserData userData, ApprovedCastBallotRefForApprovedFinalCount ref);
}
