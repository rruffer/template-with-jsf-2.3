import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexBean implements Serializable{
	
	private static final long serialVersionUID = -3818954550752003539L;

	private String message = "haaaaaaaaaaaaaaaa";
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void testeMet() {
		if(this.message.contains("i")) {
			this.message = "oooooooooooooo";			
		}else {
			this.message = "iiiiiiiiiiiiiiiiiii";			
		}
	}
	

}
