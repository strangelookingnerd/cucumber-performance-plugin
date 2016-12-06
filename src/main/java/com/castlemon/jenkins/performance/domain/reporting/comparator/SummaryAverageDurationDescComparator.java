package com.castlemon.jenkins.performance.domain.reporting.comparator;

import java.io.Serializable;
import java.util.Comparator;

import com.castlemon.jenkins.performance.domain.reporting.Summary;

public class SummaryAverageDurationDescComparator implements Comparator<Summary>, Serializable {

	private final static long serialVersionUID = 1L;

	public int compare(Summary summary1, Summary summary2) {

		Long duration1 = summary1.calculateAverageDuration();
		Long duration2 = summary2.calculateAverageDuration();

		// descending order
		return duration2.compareTo(duration1);

	}

};
