package book;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ToDo {
	String summary;
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	String description;
	

}
