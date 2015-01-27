package com.legal.sys.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ��֯���󣬸ñ����������������֯��
 * ������֯����������洢ʵ���д��ڵ���֯
 * @author CJ
 *
 */
@Entity
@Table(name="t_org")
public class Org {
	/**
	 * ��֯������id
	 */
	private int id;
	/**
	 * ��֯����������
	 */
	private String name;
	/**
	 * ��֯�����������͵�id���˴���Ҫʹ��ManyToOne
	 */
	private int typeId;
	/**
	 * ��֯�����������͵����ƣ�����
	 */
	private String typeName;
	/**
	 * ��֯�����������
	 */
	private int orderNum;
	/**
	 * ��֯�����ĸ�����֯
	 */
	private Org parent;
	/**
	 * ��������
	 */
	private int managerType;
	/**
	 * ��֯�����ĵ�ַ
	 */
	private String address;
	/**
	 * ��֯�����ĵ绰
	 */
	private String phone;
	/**
	 * ��չ����1�����������ĳЩ�������֯�洢��Ӧ����Ϣ
	 */
	private String att1;
	/**
	 * ��չ����2�����������ĳЩ�������֯�洢��Ӧ����Ϣ
	 */
	private String att2;
	/**
	 * ��չ����3�����������ĳЩ�������֯�洢��Ӧ����Ϣ
	 */
	private String att3;
	
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
	
	@Column(name="tid")
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	@Column(name="tname")
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Column(name="order_num")
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	@Column(name="manager_type")
	public int getManagerType() {
		return managerType;
	}
	public void setManagerType(int managerType) {
		this.managerType = managerType;
	}
	@ManyToOne
	@JoinColumn(name="pid")
	public Org getParent() {
		return parent;
	}
	public void setParent(Org parent) {
		this.parent = parent;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAtt1() {
		return att1;
	}
	public void setAtt1(String att1) {
		this.att1 = att1;
	}
	public String getAtt2() {
		return att2;
	}
	public void setAtt2(String att2) {
		this.att2 = att2;
	}
	public String getAtt3() {
		return att3;
	}
	public void setAtt3(String att3) {
		this.att3 = att3;
	}
	
	@Override
	public boolean equals(Object obj) {
		Org o = (Org)obj;
		return this.id==o.getId();
	}
}
