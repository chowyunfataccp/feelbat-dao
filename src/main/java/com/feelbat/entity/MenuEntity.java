package com.feelbat.entity;

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


/**
 * 菜单表
 *  @author  mike
 */
@Entity
@Table(name = "t2_menu")
public class MenuEntity  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long menuid;
	
	private Set<MenuEntity> submenu = new HashSet<MenuEntity>();
	
	private MenuEntity parent;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "menuid", unique = true, nullable = false)
	public Long getMenuid() {
		return menuid;
	}

	public void setMenuid(Long menuid) {
		this.menuid = menuid;
	}
	
	private String name;
	
	private String url;
	
	private Integer order;
	
	private GroupEntity group;
	
	//1:是裸公众号
	private Integer bare;
	
	//1：是顶级菜单
	private Integer top;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	@ManyToOne
    @JoinColumn(name="groupid")
	public GroupEntity getGroup() {
		return group;
	}

	
	public void setGroup(GroupEntity group) {
		this.group = group;
	}

	@OneToMany
	@JoinColumn(name="pid")
	public Set<MenuEntity> getSubmenu() {
		return submenu;
	}

	public void setSubmenu(Set<MenuEntity> submenu) {
		this.submenu = submenu;
	}

	@ManyToOne
    @JoinColumn(name="pid")
	public MenuEntity getParent() {
		return parent;
	}

	public void setParent(MenuEntity parent) {
		this.parent = parent;
	}

	public Integer getBare() {
		return bare;
	}

	public void setBare(Integer bare) {
		this.bare = bare;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	
	
	
	
}