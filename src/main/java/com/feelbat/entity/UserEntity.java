/*package com.feelbat.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


*//**
 * 微信用户表
 *  @author  mike
 *//*
@Entity
@Table(name = "t2_user")
public class UserEntity  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long uid;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "uid", unique = true, nullable = false)
	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}
	
	private String nickname;
	
	private Integer sex;
	
	private GroupEntity group;
	
	private Set<MerchantEntity> merchants;
	
	private String openid;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@ManyToOne
    @JoinColumn(name="gid",referencedColumnName="gid")
	public GroupEntity getGroup() {
		return group;
	}

	
	public void setGroup(GroupEntity group) {
		this.group = group;
	}

	@OneToMany
	@JoinColumn(name="userid")
	public Set<MerchantEntity> getMerchants() {
		return merchants;
	}

	public void setMerchants(Set<MerchantEntity> merchants) {
		this.merchants = merchants;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	
	
	
	
}*/