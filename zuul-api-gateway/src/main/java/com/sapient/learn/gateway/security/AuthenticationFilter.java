package com.sapient.learn.gateway.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Jwts;

public class AuthenticationFilter extends BasicAuthenticationFilter {
	
	private Environment environment;
	
	
	@Autowired
	public AuthenticationFilter(Environment environment, AuthenticationManager authManager) {
		super(authManager);
		this.environment = environment;
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain)
					throws IOException, ServletException {
		
		String authHeader =  request.getHeader(environment.getProperty("security.header.name"));
		if(null == authHeader || !authHeader.startsWith(environment.getProperty("security.header.name.prefix"))) {
			chain.doFilter(request, response);
			return;
		}
		
		UsernamePasswordAuthenticationToken authToken = authorizeRequest(request);
		SecurityContextHolder.getContext().setAuthentication(authToken);
		chain.doFilter(request, response);
		
	}
	
	private UsernamePasswordAuthenticationToken authorizeRequest(HttpServletRequest request) {
		
		String authHeader = request.getHeader(environment.getProperty("security.header.name"));
		String token = authHeader.replace(environment.getProperty("security.header.name.prefix"), "");
		
		
		System.out.println("security.header.name.prefix=" + environment.getProperty("security.header.name.prefix"));
		System.out.println("token" + token);
		
		String username= Jwts.parser().setSigningKey(environment.getProperty("secret.key")).parseClaimsJws(token).getBody().getSubject();
		
		System.out.println(authHeader);
		System.out.println(token);
		System.out.println(username);
		
		
		return new UsernamePasswordAuthenticationToken(authHeader, null, new ArrayList<GrantedAuthority>());
		
	}
}
