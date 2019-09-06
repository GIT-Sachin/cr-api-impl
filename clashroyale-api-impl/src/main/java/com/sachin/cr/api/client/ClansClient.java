package com.sachin.cr.api.client;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.api.domain.CurrentWar;
import com.sachin.cr.api.domain.ListOfClans;
import com.sachin.cr.api.domain.ListOfPlayers;
import com.sachin.cr.api.domain.ListOfStandings;

@Component
public class ClansClient extends ClashRoyaleClient {

	private String RELATIVE_PATH = "/clans";

	/**
	 * Search all clans by name and/or filtering the results using various criteria.
	 * At least one filtering criteria must be defined and if name is used as part
	 * of search, it is required to be at least three characters long It is not
	 * possible to specify ordering for results so clients should not rely on any
	 * specific ordering as that may change in the future releases of the API.
	 * 
	 * @param filters is a map which may contain only following keys<br/>
	 *                <ul>
	 *                <li><i>name</i> - Search clans by name. If name is used as
	 *                part of search query, it needs to be at least three characters
	 *                long. Name search parameter is interpreted as wild card
	 *                search, so it may appear anywhere in the clan name</li>
	 *                <li><i>locationId</i> - Filter by clan location identifier.
	 *                For list of available locations, refer to getLocations
	 *                operation.</li>
	 *                <li><i>minMembers</i> - Filter by minimum number of clan
	 *                members.</li>
	 *                <li><i>maxMembers</i> - Filter by maximum number of clan
	 *                members.</li>
	 *                <li><i>minScore</i> - Filter by minimum amount of clan
	 *                score.</li>
	 *                <li><i>limit</i> - Limit the number of items returned in the
	 *                response.</li>
	 *                <li><i>after</i> - Return only items that occur after this
	 *                marker. Before marker can be found from the response, inside
	 *                the 'paging' property. Note that only after or before can be
	 *                specified for a request, not both.</li>
	 *                <li><i>before</i> - Return only items that occur before this
	 *                marker. Before marker can be found from the response, inside
	 *                the 'paging' property. Note that only after or before can be
	 *                specified for a request, not both.</li>
	 *                </ul>
	 * @return list of clans matching the given filter criteria
	 */
	public ListOfClans getClansByFilter(Map<String, String> filters) {
		Assert.notNull(filters, "Filters argument cannot be null");
		Assert.isTrue(!filters.isEmpty(), "Atleast one filter has to be supplied");
		StringBuilder url = new StringBuilder(crApiBaseUrl + RELATIVE_PATH);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url.toString());
		for (Entry<String, String> entry : filters.entrySet()) {
			builder.queryParam(entry.getKey(), entry.getValue());
		}
		return restTemplate
				.exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(headers), ListOfClans.class)
				.getBody();
	}

	/**
	 * Get information about a single clan by clan tag. Clan tags can be found using
	 * clan search operation. Note that clan tags start with hash character '#' and
	 * that needs to be URL-encoded properly to work in URL, so for example clan tag
	 * '#2ABC' would become '%232ABC' in the URL.
	 * 
	 * @param clanTag
	 * @return
	 */
	public Clan getClanByClanTag(String clanTag) {
		Assert.notNull(clanTag, "Clantag is mandatory");
		Assert.isTrue(StringUtils.isNotBlank(clanTag), "Clantag cannot be blank");
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{clanTag}");
		return restTemplate.exchange(builder.buildAndExpand(clanTag).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), Clan.class).getBody();
	}

	/**
	 * List clan members.
	 * 
	 * @param clanTag
	 * @return
	 */
	public ListOfPlayers getMembersOfClan(String clanTag) {
		Assert.notNull(clanTag, "Clantag is mandatory");
		Assert.isTrue(StringUtils.isNotBlank(clanTag), "Clantag cannot be blank");
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{clanTag}/members");
		return restTemplate.exchange(builder.buildAndExpand(clanTag).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfPlayers.class).getBody();
	}

	/**
	 * Retrieve clan's clan war log
	 * 
	 * @param clanTag
	 * @return
	 */
	public ListOfStandings getClanWarLog(String clanTag) {
		Assert.notNull(clanTag, "Clantag is mandatory");
		Assert.isTrue(StringUtils.isNotBlank(clanTag), "Clantag cannot be blank");
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{clanTag}/warlog");
		return restTemplate.exchange(builder.buildAndExpand(clanTag).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfStandings.class).getBody();
	}

	/**
	 * Retrieve information about clan's current clan war
	 * @param clanTag
	 * @return
	 */
	public CurrentWar getClanCurrentWar(String clanTag) {
		Assert.notNull(clanTag, "Clantag is mandatory");
		Assert.isTrue(StringUtils.isNotBlank(clanTag), "Clantag cannot be blank");
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{clanTag}/currentwar");
		return restTemplate.exchange(builder.buildAndExpand(clanTag).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), CurrentWar.class).getBody();
	}

}
