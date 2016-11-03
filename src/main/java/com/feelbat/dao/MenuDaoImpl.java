package com.feelbat.dao;


import org.springframework.stereotype.Repository;

import com.feelbat.entity.MenuEntity;

@Repository("menuDao")
public class MenuDaoImpl extends BaseDaoImpl<MenuEntity> implements IMenuDao {
	
}
