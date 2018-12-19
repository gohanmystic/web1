package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import app.common.Constants;

@Entity(name = "User")
@Table(name = "USERS")
public class User {

	@Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(
            name = "idGenerator",
            parameters = @Parameter(name = Constants.PREFIX_PARAM, value = Constants.PREFIX_USER),
            strategy = "app.common.support.GeneratorPrimaryKeySupport")
    @Column(name = "USER_ID", length = 10)
	private String userId;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "CLASS_ID")
	private String classId;
	
	@ManyToOne
    @JoinColumn(name = "CLASS_ID", insertable = false, updatable = false)
    private Classes classes;
	
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
