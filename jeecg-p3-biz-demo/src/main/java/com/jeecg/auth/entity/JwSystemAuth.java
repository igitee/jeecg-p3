package com.jeecg.auth.entity;

import java.io.Serializable;

/**
 * 描述：</b>JwSystemAuth:运营系统权限表; InnoDB free: 9216 kB<br>
 * @author junfeng.zhou
 * @since：2015年12月21日 10时28分27秒 星期一 
 * @version:1.0
 */
public class JwSystemAuth implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "JwSystemAuth [id=" + id + ", authId=" + authId + ", authName="
				+ authName  + ", authType=" + authType
				+ ", authContr=" + authContr
				+ ", parentAuthId=" + parentAuthId +", leafInd=" + leafInd
				+ "]";
	}
	
}
