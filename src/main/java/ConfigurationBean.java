/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

/**
 *
 * @author hantsy
 */
@FacesConfig(
	// Activates CDI build-in beans
	version = Version.JSF_2_3 
)
@ApplicationScoped
public class ConfigurationBean {

}
