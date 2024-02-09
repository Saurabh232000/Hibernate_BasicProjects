package HibernateEmbeddableAnnotation;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String courseName;
	private String courseDuration;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

}
