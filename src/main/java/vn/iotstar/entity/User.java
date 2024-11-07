package vn.iotstar.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "SELECT v FROM User v")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "fullname", columnDefinition = "NVARCHAR(50) NULL")
	private String fullname;

	@Column(name = "gender", columnDefinition = "NVARCHAR(10) NULL")
	private String gender;

	@Column(name = "birthday")
	private LocalDateTime birthday;

	@Column(name = "email", columnDefinition = "NVARCHAR(50) NULL")
	private String email;

	@Column(name = "image", columnDefinition = "NVARCHAR(500) NULL")
	private String image;
	
	@Column(name = "password", columnDefinition = "NVARCHAR(50) NULL")
	private String password;
	
	@Column(name = "phone", columnDefinition = "NVARCHAR(50) NULL")
	private String phone;
	
	@Column(name = "creatDate")
	private LocalDateTime createDate;

	// bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name = "roleId")

	private Role role;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
