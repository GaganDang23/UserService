package com.webosmotic.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;

public class AuthenticationService {
	
	private static final String AUTH_HEADER_TOKEN_NAME="X-API-KEY";
	
	private static final String AUTH_TOKEN="gdang";
	
	
	public static  Authentication getAuthentication(HttpServletRequest request) {
		String apiKey= request.getHeader(AUTH_HEADER_TOKEN_NAME);
		if (apiKey ==null || !apiKey.equals(AUTH_TOKEN)) {
			throw new BadCredentialsException ("Invalid Api Key");
		}
		return new ApiKeyAuthentication(apiKey, AuthorityUtils.NO_AUTHORITIES);
		
	}

}
