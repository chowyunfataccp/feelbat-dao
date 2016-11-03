package com.feelbat.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 用户组表
 *  @author  mike
 */
@Entity
@Table(name = "t1_group")
public class GroupEntity  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long gid;
	
	private String name;

//	private Set<UserEntity> users;
	
	private Set<MenuEntity> menus;
	
//	private Set<MerchantEntity> merchants;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "gid", unique = true, nullable = false)
	public Long getGid() {
		return gid;
	}

	public void setGid(Long gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


/*
	@OneToMany
	@JoinColumn(name="gid")
	public Set<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(Set<UserEntity> users) {
		this.users = users;
	}
*/
	@OneToMany
	@JoinColumn(name="groupid")
	public Set<MenuEntity> getMenus() {
		return menus;
	}

	public void setMenus(Set<MenuEntity> menus) {
		this.menus = menus;
	}
/*
	@OneToMany
	@JoinColumn(name="groupid")
	public Set<MerchantEntity> getMerchants() {
		return merchants;
	}

	public void setMerchants(Set<MerchantEntity> merchants) {
		this.merchants = merchants;
	}

	*/
	
	
}