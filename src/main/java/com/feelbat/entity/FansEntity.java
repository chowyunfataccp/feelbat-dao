/*package com.feelbat.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


*//**
 * 粉丝表（广告商-粉丝关系表）
 *  @author  mike
 *//*
@Entity
@Table(name = "t4_menu")
public class FansEntity  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private MerchantEntity merchant;
	
	private UserEntity user;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
    @JoinColumn(name="merchantid",referencedColumnName="merchantid")
	public MerchantEntity getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantEntity merchant) {
		this.merchant = merchant;
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