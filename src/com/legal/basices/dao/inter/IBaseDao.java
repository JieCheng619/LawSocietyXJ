package com.legal.basices.dao.inter;
/**
 * ������DAO���������������а�����Hibernate�����л��������Ͷ�SQL�Ĳ���
 * @author CJ
 *
 * @param <T>
 */
public interface IBaseDao<T> {
	/**
	 * ��Ӷ���
	 * @param t
	 * @return
	 */
	public T add(T t);
	/**
	 * ���¶���
	 * @param t
	 */
	public void update(T t);
	/**
	 * ����idɾ������
	 * @param id
	 */
	public void delete(int id);
	/**
	 * ����id���ض���
	 * @param id
	 * @return
	 */
	public T load(int id);
}
