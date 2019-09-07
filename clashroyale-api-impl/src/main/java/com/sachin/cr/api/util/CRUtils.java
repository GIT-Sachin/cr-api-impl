package com.sachin.cr.api.util;

import java.util.HashMap;
import java.util.Map;

public class CRUtils {

	public static Map<String, String> getClansFilter(String filterName, String filterValue) {
		Map<String, String> filters = new HashMap<>();
		filters.put(filterName, filterValue);
		return filters;
	}
}
