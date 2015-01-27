package com.legal.sys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ��ɫ�Ķ�������ȷ��ĳ����Ա�����ĸ�λ
 * �洢�ľ��ǽ�ɫ������
 * @author CJ
 *
 */
@Entity
@Table(name="t_position")
public class Position {
	/**
	 * ��ɫ�ı�ʶ
	 */
	private int id;
	/**
	 * ��ɫ������
	 */
	private String name;
	/**
	 * ��ɫ��sn
	 */
	private String sn;
	/**
	 * ��ɫ���Ƿ�߱������ܣ�Ŀǰ���岻��
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
