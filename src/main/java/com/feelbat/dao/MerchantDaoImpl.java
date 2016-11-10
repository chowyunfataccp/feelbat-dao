package com.feelbat.dao;


import org.springframework.stereotype.Repository;

import com.feelbat.entity.MerchantEntity;

@Repository("merchantDao")
public class MerchantDaoImpl extends BaseDaoImpl<MerchantEntity> implements IMerchantDao {
	
}
