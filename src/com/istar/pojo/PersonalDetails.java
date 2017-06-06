package com.istar.pojo;

public class PersonalDetails
{
	private int id;
	private String name;
	private String dob;
	private String address;
	private String nickname;
	private String type;
	private String relationship;
	private String companyname;
	private String website;
	private Long landlineno;
	public PersonalDetails(){
		super();
	}
	
	public PersonalDetails(int id,String name,String dob,String address,String nickname,
			String type,String relationship,String companyname,String website,Long landlineno)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.address=address;
		this.nickname=nickname;
		this.type=type;
		this.relationship=relationship;
		this.companyname=companyname;
		this.website=website;
		this.landlineno=landlineno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Long getLandlineno() {
		return landlineno;
	}

	public void setLandlineno(Long landlineno) {
		this.landlineno = landlineno;
	}

	@Override
	public String toString() {
		return "PersonalDetails [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", nickname="
				+ nickname + ", type=" + type + ", relationship=" + relationship + ", companyname=" + companyname
				+ ", website=" + website + ", landlineno=" + landlineno + "]";
	}
		
	}

	

	

