package iaskLinksPortlets;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class IaskLinksPortletsApplication extends Application {

	public void init() {
		Window window = new Window();

		setMainWindow(window);

		Label label = new Label("Hello IaskLinksPortlets!");
		//http://localhost:8080/web/guest/regulativni-dokumenti
		Label url1 = new Label("<a href=\"http://www.agrozahist.org\">Українська асоціація фумігації і захисту рослин</a>",Label.CONTENT_XHTML);
		Label url2 = new Label("<a href=\"http://fumigacia.com/\">Торгівельна система реалізації СЗР</a>",Label.CONTENT_XHTML);
		Label url3 = new Label("<a href=\"http://rada.gov.ua/\">Законодавство</a>",Label.CONTENT_XHTML);
		Label url4 = new Label("<a href=\"http://localhost:8080/web/guest/regulativni-dokumenti\">Правова база</a>",Label.CONTENT_XHTML);
		window.addComponent(new Label("<div style=\"width:20px;height:20px;\"></div>",Label.CONTENT_XHTML));
		window.addComponent(url1);
		window.addComponent(new Label("<div style=\"width:20px;height:20px;\"></div>",Label.CONTENT_XHTML));
		window.addComponent(url2);
		window.addComponent(new Label("<div style=\"width:20px;height:20px;\"></div>",Label.CONTENT_XHTML));
		//window.addComponent(url3);
		//window.addComponent(new Label("<div style=\"width:20px;height:40px;\"></div>",Label.CONTENT_XHTML));
		window.addComponent(url4);
	}

}