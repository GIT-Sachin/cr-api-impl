package com.sachin.cr.api.client;

import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * To be implemented at a later stage if required
 * 
 * @author Sachin
 *
 */
@Component
public class TournamentsClient extends ClashRoyaleClient {

	private String RELATIVE_PATH = "/tournaments";

	private void getListOfAllTournaments(Map<String, String> filter) {
	}

	private void getTournamentByTag(String tournamentTag) {

	}
}
