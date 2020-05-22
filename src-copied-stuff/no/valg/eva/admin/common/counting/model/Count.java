package no.valg.eva.admin.common.counting.model;

import no.valg.eva.admin.common.AreaPath;

import java.util.List;

public interface Count {
	boolean isPreliminaryCount();

	boolean isFinalCount();

	String getAreaName();

	AreaPath getAreaPath();

	String getStatusName();

	CountCategory getCategory();

	CountStatus getStatus();

	boolean isNew();

	boolean isSaved();

	boolean isRevoked();

	boolean isApproved();

	boolean isEditable();

	boolean isManualCount();

	int getOrdinaryBallotCount();

	int getModifiedBallotCount();

	int getUnmodifiedBallotCount();

	List<BallotCount> getBallotCounts();

	Integer getBlankBallotCount();

	void setBlankBallotCount(Integer blankBallotCount);

	Integer getQuestionableBallotCount();

	void setQuestionableBallotCount(Integer questionableBallotCount);

	boolean hasRejectedBallotCounts();

	List<RejectedBallotCount> getRejectedBallotCounts();

	int getTotalRejectedBallotCount();

	int getTotalBallotCount();

	String getComment();

	/**
	 * @return late validation coveers if they are relevant for this count (preliminary) and category (FO or FS)
	 */
	Integer getLateValidationCovers();
}
