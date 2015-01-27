package com.legal.sys.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ��Ա��֯��ɫ��Ӧ��ϵ�����ű�����洢����Ա����֯�ͽ�ɫ�Ķ�Ӧ��ϵ
 * @author CJ
 *
 */
@Entity
@Table(name="t_person_org_pos")
public class PersonOrgPos {
	/**
	 * ��ϵ��ʶ
	 */
	private int id;
	/**
	 * ��Աid������Ҳ���Դ洢ʵ���࣬���ǲ�̫����
	 */
	private int personId;
	/**
	 * ��֯��id
	 */
	private int orgId;
	/**
	 * ��λ��id
	 */
	private int posId;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="person_id")
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	@Column(name="org_id")
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	@Column(name="pos_id")
	public int getPosId() {
		return posId;
	}
	public void setPosId(int posId) {
		this.posId = posId;
	}
}
