package cz.metacentrum.perun.oidc.overlay;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Map;

/**
 * @author Ondrej Velisek <ondrejvelisek@gmail.com>
 */
public class PerunWebAuthenticationDetails extends WebAuthenticationDetails {

	private Map<String, Serializable> additionalInfo;

	public PerunWebAuthenticationDetails(HttpServletRequest request, Map<String, Serializable> additionalInfo) {
		super(request);
		this.additionalInfo = additionalInfo;
	}

	public Map<String, Serializable> getAdditionalInfo() {
		return additionalInfo;
	}
}
