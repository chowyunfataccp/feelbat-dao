/*package com.feelbat.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


*//**
 * 广告商户表
 *  @author  mike
 *//*
@Entity
@Table(name = "t3_merchant")
public class MerchantEntity  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long merchantid;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "merchantid", unique = true, nullable = false)
	public Long getMerchantid() {
		return merchantid;
	}

	public void setMerchantid(Long merchantid) {
		this.merchantid = merchantid;
	}
	
	private String name;
	
	private Integer sceneid;
	
	private String ticket;
	
	private GroupEntity group;
	
	private UserEntity user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Integer getSceneid() {
		return sceneid;
	}

	public void setSceneid(Integer sceneid) {
		this.sceneid = sceneid;
	}

	@ManyToOne
    @JoinColumn(name="groupid",referencedColumnName="groupid")
	public GroupEntity getGroup() {
		return group;
	}

	
	public void setGroup(GroupEntity group) {
		this.group = group;
	}

	@ManyToOne
    @JoinColumn(name="userid",referencedColumnName="userid")
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	
	
	
	
}*/