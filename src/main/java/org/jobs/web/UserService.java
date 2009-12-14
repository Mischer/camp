package org.jobs.web;

import org.apache.log4j.Logger;
import org.jobs.ws.bean.UsersManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.userdetails.UserDetails;
import org.springframework.security.userdetails.UserDetailsService;
import org.springframework.security.userdetails.UsernameNotFoundException;

/**
 * @author vit
 */
public class UserService implements UserDetailsService {
	private static Logger log = Logger.getLogger(UserService.class);
	
	@Autowired
	private UsersManager usersManager;

	public UserService() {

	}

	@Override
	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException, DataAccessException {
		if (log.isDebugEnabled()) {
			log.debug(String.format("Load user %s", login));
		}
		UserDetails details = usersManager.getUserByLogin(login);
		return details;
	}

}
