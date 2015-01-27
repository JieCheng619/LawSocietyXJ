package com.legal.sys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 角色的对象，用来确定某个人员所属的岗位
 * 存储的就是角色的名称
 * @author CJ
 *
 */
@Entity
@Table(name="t_position")
public class Position {
	/**
	 * 角色的标识
	 */
	private int id;
	/**
	 * 角色的名称
	 */
	private String name;
	/**
	 * 角色的sn
	 */
	private String sn;
	/**
	 * 角色的是否具备管理功能，目前意义不大
	 */
	private int manager;

	@Id
	@GeneratedValue
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
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
}
